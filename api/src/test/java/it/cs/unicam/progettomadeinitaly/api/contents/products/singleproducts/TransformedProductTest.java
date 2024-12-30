package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformedProductTest {

    @Test
    void testTransformedProductCreationSuccess() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");
        assertNotNull(product);
        assertEquals(1, product.getId());
        assertEquals("Author 1", product.getAuthor());
        assertNull(product.getTransformationProcess());
    }

    @Test
    void testSetTransformationProcessSuccess() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");
        TransformationProcess process = new TransformationProcess(1,"Author 1");

        product.setTransformationProcess(process);

        assertNotNull(product.getTransformationProcess());
        assertEquals("Process 1", product.getTransformationProcess().getName());
    }

    @Test
    void testSetTransformationProcessNull() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setTransformationProcess(null));
        assertEquals("A transformed product must have a transformation process", exception.getMessage());
    }

    @Test
    void testSetNameSuccess() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");
        product.setName("Product Name");

        assertEquals("Product Name", product.getName());
    }

    @Test
    void testSetNameNull() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setName(null));
        assertEquals("A single product must have a name", exception.getMessage());
    }

    @Test
    void testSetDescriptionSuccess() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");
        product.setDescription("Product Description");

        assertEquals("Product Description", product.getDescription());
    }

    @Test
    void testSetDescriptionNull() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setDescription(null));
        assertEquals("A single product must have a description", exception.getMessage());
    }

    @Test
    void testSetCertificationSuccess() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");
        product.setCertification("Certification 1");

        assertEquals("Certification 1", product.getCertification());
    }

    @Test
    void testSetCertificationNull() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setCertification(null));
        assertEquals("A single product must have a certification", exception.getMessage());
    }

    @Test
    void testSetVarietySuccess() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");
        product.setVariety("Variety 1");

        assertEquals("Variety 1", product.getVariety());
    }

    @Test
    void testSetVarietyNull() {
        TransformedProduct product = new TransformedProduct(1, "Author 1");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                product.setVariety(null));
        assertEquals("A single product must have a variety", exception.getMessage());
    }

}