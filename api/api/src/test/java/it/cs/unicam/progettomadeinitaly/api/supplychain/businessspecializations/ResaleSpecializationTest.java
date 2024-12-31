package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.RawProductOnSale;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResaleSpecializationTest {

    private IBusinessSpecialization resaleSpecialization;

    private RawProductOnSale expectedContentToAdd_rawProductOnSale;

    private RawProduct unexpectedContent;

    @BeforeEach
    void setUp() {
        resaleSpecialization = new ResaleSpecialization();

        unexpectedContent = new RawProduct(0,"Test_Author");

        expectedContentToAdd_rawProductOnSale = new RawProductOnSale(0,"Test_Author",unexpectedContent);
    }

    /**
     * Any attempt at adding an unexpected type content (that is a content
     * that is not a specific of a ProductOnSale)
     * will result in the throwing of an IllegalArgumentException
     * <p>
     * Note: Details of the contents are unnecessary,
     * this is just a test to check if products on sale
     * can be added to a resaleSpecialization
     */
    @Test
    void addContent() {
        // null case
        Assertions.assertThrows(NullPointerException.class,
                () -> resaleSpecialization.addContent(null));

        // Successful case where a Raw Product is added to the businessSpecialization
        Assertions.assertTrue(resaleSpecialization.addContent
                (expectedContentToAdd_rawProductOnSale));

        // Attempt at adding a content of an unexpected type
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> resaleSpecialization.addContent(unexpectedContent));
    }

}