package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RawProductTest {

    @Test
    void testRawProductCreationSuccess() {
        RawProduct product = new RawProduct(1, "Author 1");
        assertNotNull(product);
        assertEquals(1, product.getId());
        assertEquals("Author 1", product.getAuthor());
        assertNull(product.getProductionMethod());
    }

    @Test
    void testSetProductionMethodSuccess() {
        RawProduct product = new RawProduct(1, "Author 1");
        product.setProductionMethod("Organic Farming");

        assertEquals("Organic Farming", product.getProductionMethod());
    }

    @Test
    void testSetProductionMethodNull() {
        RawProduct product = new RawProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setProductionMethod(null));
        assertEquals("A raw product must have a production method", exception.getMessage());
    }

    @Test
    void testSetNameSuccess() {
        RawProduct product = new RawProduct(1, "Author 1");
        product.setName("Raw Product Name");

        assertEquals("Raw Product Name", product.getName());
    }

    @Test
    void testSetNameNull() {
        RawProduct product = new RawProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setName(null));
        assertEquals("A single product must have a name", exception.getMessage());
    }

    @Test
    void testSetDescriptionSuccess() {
        RawProduct product = new RawProduct(1, "Author 1");
        product.setDescription("Raw Product Description");

        assertEquals("Raw Product Description", product.getDescription());
    }

    @Test
    void testSetDescriptionNull() {
        RawProduct product = new RawProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setDescription(null));
        assertEquals("A single product must have a description", exception.getMessage());
    }

    @Test
    void testSetCertificationSuccess() {
        RawProduct product = new RawProduct(1, "Author 1");
        product.setCertification("Certification 1");

        assertEquals("Certification 1", product.getCertification());
    }

    @Test
    void testSetCertificationNull() {
        RawProduct product = new RawProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setCertification(null));
        assertEquals("A single product must have a certification", exception.getMessage());
    }

    @Test
    void testSetVarietySuccess() {
        RawProduct product = new RawProduct(1, "Author 1");
        product.setVariety("Variety 1");

        assertEquals("Variety 1", product.getVariety());
    }

    @Test
    void testSetVarietyNull() {
        RawProduct product = new RawProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setVariety(null));
        assertEquals("A single product must have a variety", exception.getMessage());
    }

}