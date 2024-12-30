package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RawProductOnSaleTest {

    private RawProduct rawProduct;
    private RawProductOnSale rawProductOnSale;

    @BeforeEach
    void setUp() {
        rawProduct = new RawProduct(1, "Test_Author");
        rawProduct.setName("Test_Product_Name");
        rawProduct.setDescription("Test_Description");
        rawProduct.setCertification("Test_Certification");
        rawProduct.setVariety("Test_Variety");
        rawProduct.setProductionMethod("Test_Production_Method");

        rawProductOnSale = new RawProductOnSale(2, "TestAuthor", rawProduct);
        rawProductOnSale.setPrice(1.99f);
        rawProductOnSale.setQuantity(100);
    }

    @Test
    void testGetName() {
        assertEquals("Test_Product_Name", rawProductOnSale.getName());
    }

    @Test
    void testGetDescription() {
        assertEquals("Test_Description", rawProductOnSale.getDescription());
    }

    @Test
    void testGetCertification() {
        assertEquals("Test_Certification", rawProductOnSale.getCertification());
    }

    @Test
    void testGetVariety() {
        assertEquals("Test_Variety", rawProductOnSale.getVariety());
    }

    @Test
    void testGetProductionMethod() {
        assertEquals("Test_Production_Method", rawProductOnSale.getProductionMethod());
    }

    @Test
    void testSetPrice_ValidPrice() {
        rawProductOnSale.setPrice(2.50f);
        assertEquals(2.50f, rawProductOnSale.getPrice());
    }

    @Test
    void testSetPrice_InvalidPrice() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            rawProductOnSale.setPrice(-1.0f);
        });
        assertEquals("Price cannot be negative or 0", exception.getMessage());
    }

    @Test
    void testSetQuantity_ValidQuantity() {
        rawProductOnSale.setQuantity(50);
        assertEquals(50, rawProductOnSale.getQuantity());
    }

    @Test
    void testSetQuantity_InvalidQuantity() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            rawProductOnSale.setQuantity(-5);
        });
        assertEquals("Quantity cannot be negative", exception.getMessage());
    }

    @Test
    void testPublish() {
        assertFalse(rawProductOnSale.isPublished());
        rawProductOnSale.publish();
        assertTrue(rawProductOnSale.isPublished());
    }

    @Test
    void testConstructor_NullProduct() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            new RawProductOnSale(3, "Test_Author", null);
        });
        assertEquals("Product cannot be null", exception.getMessage());
    }

}