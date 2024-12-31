package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformationSpecializationTest {

    private IBusinessSpecialization transformationSpecialization;

    private TransformedProduct expectedContentToAdd_transformedProduct;
    private TransformationProcess expectedContentToAdd_process;

    private RawProduct unexpectedContent;

    @BeforeEach
    void setUp() {
        transformationSpecialization = new TransformationSpecialization();

        expectedContentToAdd_transformedProduct = new TransformedProduct(0,"Test_Author");
        expectedContentToAdd_process = new TransformationProcess(0,"Test_Author");

        unexpectedContent = new RawProduct(0,"Test_Author");
    }

    /**
     * Any attempt at adding an unexpected type content (that is a content
     * that is not a TransformedProduct or a TransformationProcess)
     * will result in the throwing of an IllegalArgumentException
     * <p>
     * Note: Details of the contents are unnecessary,
     * this is just a test to check if transformed products and transformation
     * processes can be added to a transformationSpecialization
     */
    @Test
    void addContent() {
        // null case
        Assertions.assertThrows(NullPointerException.class,
                () -> transformationSpecialization.addContent(null));

        // Successful case where a Raw Product is added to the businessSpecialization
        Assertions.assertTrue(transformationSpecialization.addContent(expectedContentToAdd_transformedProduct));
        Assertions.assertTrue(transformationSpecialization.addContent(expectedContentToAdd_process));

        // Attempt at adding a content of an unexpected type
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transformationSpecialization.addContent(unexpectedContent));
    }

}