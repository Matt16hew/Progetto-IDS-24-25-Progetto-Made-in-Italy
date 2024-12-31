package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductPackageOnSaleTest {

    @Test
    void testProductPackageOnSaleCreationSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        ProductPackageOnSale productPackageOnSale = new ProductPackageOnSale(2, "Author 2", productPackage);
        assertNotNull(productPackageOnSale);
        assertEquals(2, productPackageOnSale.getId());
        assertEquals("Author 2", productPackageOnSale.getAuthor());
        assertEquals(productPackage, productPackageOnSale.productSetOnSale);
    }

    @Test
    void testProductPackageOnSaleCreationNullProduct() {
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                new ProductPackageOnSale(2, "Author 2", null));
        assertEquals("Product cannot be null", exception.getMessage());
    }

    @Test
    void testSetPriceSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        ProductPackageOnSale productPackageOnSale = new ProductPackageOnSale(2, "Author 2", productPackage);
        productPackageOnSale.setPrice(99.99f);
        assertEquals(99.99f, productPackageOnSale.getPrice());
    }

    @Test
    void testSetPriceInvalid() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        ProductPackageOnSale productPackageOnSale = new ProductPackageOnSale(2, "Author 2", productPackage);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                productPackageOnSale.setPrice(-10f));
        assertEquals("Price cannot be negative or 0", exception.getMessage());
    }

    @Test
    void testSetQuantitySuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        ProductPackageOnSale productPackageOnSale = new ProductPackageOnSale(2, "Author 2", productPackage);
        productPackageOnSale.setQuantity(10);
        assertEquals(10, productPackageOnSale.getQuantity());
    }

    @Test
    void testSetQuantityInvalid() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        ProductPackageOnSale productPackageOnSale = new ProductPackageOnSale(2, "Author 2", productPackage);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                productPackageOnSale.setQuantity(-5));
        assertEquals("Quantity cannot be negative", exception.getMessage());
    }

    @Test
    void testGetProductsFromProductPackageOnSale() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        Product product1 = new RawProduct(2, "Author 2");
        Product product2 = new RawProduct(3, "Author 3");
        productPackage.addProduct(product1);
        productPackage.addProduct(product2);

        ProductPackageOnSale productPackageOnSale = new ProductPackageOnSale(4, "Author 4", productPackage);
        List<Product> products = productPackageOnSale.getProducts();

        assertEquals(2, products.size());
        assertTrue(products.contains(product1));
        assertTrue(products.contains(product2));
    }
}
