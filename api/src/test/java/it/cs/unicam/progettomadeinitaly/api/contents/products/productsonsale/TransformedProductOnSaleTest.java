package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import static org.junit.jupiter.api.Assertions.*;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransformedProductOnSaleTest {

    private TransformedProduct mockTransformedProduct;
    private TransformedProductOnSale transformedProductOnSale;

    @BeforeEach
    void setUp() {
        TransformationProcess tp = new TransformationProcess(0,"Test_Author");
        tp.setName("Test_Process_Name");

        mockTransformedProduct = new TransformedProduct(0,"Test_Author");
        mockTransformedProduct.setName("Test_Product_Name");
        mockTransformedProduct.setDescription("Test_Description");
        mockTransformedProduct.setCertification("Test_Certification");
        mockTransformedProduct.setVariety("Test_Variety");
        mockTransformedProduct.setTransformationProcess(tp);

        transformedProductOnSale = new TransformedProductOnSale(1, "Author", mockTransformedProduct);
    }

    @Test
    void testGetName() {
        assertEquals("Test_Product_Name", transformedProductOnSale.getName());
    }

    @Test
    void testGetDescription() {
        assertEquals("Test_Description", transformedProductOnSale.getDescription());
    }

    @Test
    void testGetCertification() {
        assertEquals("Test_Certification", transformedProductOnSale.getCertification());
    }

    @Test
    void testGetVariety() {
        assertEquals("Test_Variety", transformedProductOnSale.getVariety());
    }

    @Test
    void testGetTransformationProcess() {
        assertNotNull(transformedProductOnSale.getTransformationProcess());
        assertEquals("Test_Process_Name", transformedProductOnSale.getTransformationProcess().getName());
    }

    @Test
    void testSetAndGetPrice() {
        transformedProductOnSale.setPrice(100.0f);
        assertEquals(100.0f, transformedProductOnSale.getPrice());
    }

    @Test
    void testSetPriceInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> transformedProductOnSale.setPrice(0));
        assertThrows(IllegalArgumentException.class, () -> transformedProductOnSale.setPrice(-10));
    }

    @Test
    void testSetAndGetQuantity() {
        transformedProductOnSale.setQuantity(10);
        assertEquals(10, transformedProductOnSale.getQuantity());
    }

    @Test
    void testSetQuantityInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> transformedProductOnSale.setQuantity(-1));
    }

    @Test
    void testConstructorNullProduct() {
        assertThrows(NullPointerException.class, () -> new TransformedProductOnSale(1, "Author", null));
    }

}
