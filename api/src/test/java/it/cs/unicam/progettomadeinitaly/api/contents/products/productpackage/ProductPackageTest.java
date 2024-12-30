package it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.RawProductOnSale;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductPackageTest {

    @Test
    void testProductPackageCreationSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        assertNotNull(productPackage);
        assertEquals(1, productPackage.getId());
        assertEquals("Author 1", productPackage.getAuthor());
        assertTrue(productPackage.getProducts().isEmpty());
    }

    @Test
    void testSetNameSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        productPackage.setName("Package Name");
        assertEquals("Package Name", productPackage.getName());
    }

    @Test
    void testSetNameNull() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                productPackage.setName(null));
        assertEquals("A product package must have a name", exception.getMessage());
    }

    @Test
    void testSetDescriptionSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        productPackage.setDescription("Package Description");
        assertEquals("Package Description", productPackage.getDescription());
    }

    @Test
    void testSetDescriptionNull() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                productPackage.setDescription(null));
        assertEquals("A product package must have a description", exception.getMessage());
    }

    @Test
    void testAddProductSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        Product product = new RawProduct(2, "Product Author");
        assertTrue(productPackage.addProduct(product));
        assertEquals(1, productPackage.getProducts().size());
        assertEquals(product, productPackage.getProducts().getFirst());
    }

    @Test
    void testAddProductNull() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                productPackage.addProduct(null));
        assertEquals("Cannot add null to a product package", exception.getMessage());
    }

    @Test
    void testAddProductOnSale() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        RawProduct product1 = new RawProduct(2, "Author 2");
        RawProductOnSale productOnSale = new RawProductOnSale(3, "Sale Author", product1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                productPackage.addProduct(productOnSale));
        assertEquals("Products on sale cannot be added to a product package", exception.getMessage());
    }

    @Test
    void testAddProductsSuccess() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        Product product1 = new RawProduct(2, "Author 2");
        Product product2 = new RawProduct(3, "Author 3");
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        assertTrue(productPackage.addProducts(products));
        assertEquals(2, productPackage.getProducts().size());
        assertTrue(productPackage.getProducts().contains(product1));
        assertTrue(productPackage.getProducts().contains(product2));
    }

    @Test
    void testAddProductsNull() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                productPackage.addProducts(null));
        assertEquals("Cannot add null to a product package", exception.getMessage());
    }

    @Test
    void testAddProductsEmptyList() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        List<Product> products = new ArrayList<>();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                productPackage.addProducts(products));
        assertEquals("Cannot add an empty list to a product package", exception.getMessage());
    }

    @Test
    void testAddProductsWithProductOnSale() {
        ProductPackage productPackage = new ProductPackage(1, "Author 1");
        RawProduct product1 = new RawProduct(2, "Author 2");
        Product productOnSale = new RawProductOnSale(3, "Sale Author", product1);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(productOnSale);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                productPackage.addProducts(products));
        assertEquals("Products on sale cannot be added to a product package", exception.getMessage());
    }
}