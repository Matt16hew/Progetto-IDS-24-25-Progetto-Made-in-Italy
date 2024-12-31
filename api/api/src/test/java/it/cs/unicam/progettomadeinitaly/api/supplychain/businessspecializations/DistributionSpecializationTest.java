package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.RawProductOnSale;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributionSpecializationTest {

    private IBusinessSpecialization distributionSpecialization;

    private ProductPackage expectedContentToAdd_productPackage;
    private RawProduct expectedContentToAdd_singleProduct_rawProduct;

    private RawProductOnSale unexpectedContent;

    @BeforeEach
    void setUp() {
        distributionSpecialization = new DistributionSpecialization();

        expectedContentToAdd_productPackage = new ProductPackage(0,"Test_Author");
        expectedContentToAdd_singleProduct_rawProduct = new RawProduct(0,"Test_Author");

        unexpectedContent = new RawProductOnSale
                (0,"Test_Author",expectedContentToAdd_singleProduct_rawProduct);
    }

    /**
     * Any attempt at adding an unexpected type content (that is a content
     * that is not a ProductPackage or a SingleProduct)
     * will result in the throwing of an IllegalArgumentException
     * <p>
     * Note: Details of the contents are unnecessary,
     * this is just a test to check if product packages and single products
     * can be added to a distributionSpecialization
     */
    @Test
    void addContent() {
        // null case
        Assertions.assertThrows(NullPointerException.class,
                () -> distributionSpecialization.addContent(null));

        // Successful case where a Raw Product is added to the businessSpecialization
        Assertions.assertTrue(distributionSpecialization.addContent
                (expectedContentToAdd_productPackage));
        Assertions.assertTrue(distributionSpecialization.addContent
                (expectedContentToAdd_singleProduct_rawProduct));

        // Attempt at adding a content of an unexpected type
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> distributionSpecialization.addContent(unexpectedContent));
    }

}