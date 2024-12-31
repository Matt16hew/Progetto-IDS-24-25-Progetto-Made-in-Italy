package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductionSpecializationTest {

    private IBusinessSpecialization productionSpecialization;
    private RawProduct expectedContentToAdd_rawProduct;
    private TransformedProduct unexpectedContent;

    @BeforeEach
    void setUp() {
        productionSpecialization = new ProductionSpecialization();
        expectedContentToAdd_rawProduct = new RawProduct(0,"Test_Author");
        unexpectedContent = new TransformedProduct(0,"Test_Author");
    }

    /**
     * Any attempt at adding an unexpected type content (that is a content that is not a RawProduct)
     * will result in the throwing of an IllegalArgumentException
     * <p>
     * Note: Details of the expectedContentToAdd are unnecessary,
     * this is just a test to check if raw products can be added
     * to a productionSpecialization
     */
    @Test
    void addContent() {
        // null case
        Assertions.assertThrows(NullPointerException.class,
                () -> productionSpecialization.addContent(null));

        // Successful case where a Raw Product is added to the businessSpecialization
        Assertions.assertTrue(productionSpecialization.addContent(expectedContentToAdd_rawProduct));

        // Attempt at adding a content of an unexpected type
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> productionSpecialization.addContent(unexpectedContent));

    }

}