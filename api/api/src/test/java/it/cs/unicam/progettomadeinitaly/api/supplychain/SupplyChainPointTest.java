package it.cs.unicam.progettomadeinitaly.api.supplychain;

import it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplyChainPointTest {

    private SupplyChainPoint supplyChainPoint;

    @BeforeEach
    void setUp() {
        Coordinate coord = new Coordinate(1, 2);

        supplyChainPoint = new SupplyChainPoint(0,"Test_Supply_Chain_Point",coord);
    }

    @Test
    void addBusinessSpecialization() {
        IBusinessSpecialization productionBusinessSpecialization = new ProductionSpecialization();
        IBusinessSpecialization transformationBusinessSpecialization = new TransformationSpecialization();
        IBusinessSpecialization distributionBusinessSpecialization = new DistributionSpecialization();
        IBusinessSpecialization resaleBusinessSpecialization = new ResaleSpecialization();

        // Attempting to add null as business specialization
        Assertions.assertThrows(NullPointerException.class,
                () -> supplyChainPoint.addBusinessSpecialization(null));

        // Adding business specializations
        Assertions.assertTrue(supplyChainPoint.addBusinessSpecialization(productionBusinessSpecialization));
        Assertions.assertTrue(supplyChainPoint.addBusinessSpecialization(transformationBusinessSpecialization));
        Assertions.assertTrue(supplyChainPoint.addBusinessSpecialization(distributionBusinessSpecialization));
        Assertions.assertTrue(supplyChainPoint.addBusinessSpecialization(resaleBusinessSpecialization));

        // Adding business specializations that are already present
        Assertions.assertFalse(supplyChainPoint.addBusinessSpecialization(productionBusinessSpecialization));
        Assertions.assertFalse(supplyChainPoint.addBusinessSpecialization(transformationBusinessSpecialization));
        Assertions.assertFalse(supplyChainPoint.addBusinessSpecialization(distributionBusinessSpecialization));
        Assertions.assertFalse(supplyChainPoint.addBusinessSpecialization(resaleBusinessSpecialization));
    }

    @Test
    void getId() {
        Assertions.assertEquals(0,supplyChainPoint.getId());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Test_Supply_Chain_Point",supplyChainPoint.getName());
    }

    @Test
    void getCoordinate() {
        Assertions.assertEquals(1, supplyChainPoint.getCoordinate().getLatitude());
        Assertions.assertEquals(2, supplyChainPoint.getCoordinate().getLongitude());
    }

    @Test
    void getBusinessSpecializationByName() {
        // Cannot access to a business specialization without a name
        Assertions.assertThrows(NullPointerException.class,
                () -> supplyChainPoint.getBusinessSpecializationByName(null));

        // Cannot access to a business specialization if none are present
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> supplyChainPoint.getBusinessSpecializationByName
                        (DefaultSpecializationNames.PRODUCTION_SPECIALIZATION.getName()));

        IBusinessSpecialization productionBusinessSpecialization = new ProductionSpecialization();
        IBusinessSpecialization transformationBusinessSpecialization = new TransformationSpecialization();
        IBusinessSpecialization distributionBusinessSpecialization = new DistributionSpecialization();
        IBusinessSpecialization resaleBusinessSpecialization = new ResaleSpecialization();

        supplyChainPoint.addBusinessSpecialization(productionBusinessSpecialization);
        supplyChainPoint.addBusinessSpecialization(transformationBusinessSpecialization);
        supplyChainPoint.addBusinessSpecialization(distributionBusinessSpecialization);
        supplyChainPoint.addBusinessSpecialization(resaleBusinessSpecialization);

        // Cannot access due to unexpected specialization name
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> supplyChainPoint.getBusinessSpecializationByName
                        ("Unexpected_Business_Specialization_Name"));

        // Scenarios where the business specializations are successfully recovered
        Assertions.assertEquals(productionBusinessSpecialization,
                supplyChainPoint.getBusinessSpecializationByName
                        (DefaultSpecializationNames.PRODUCTION_SPECIALIZATION.getName()));
        Assertions.assertEquals(transformationBusinessSpecialization,
                supplyChainPoint.getBusinessSpecializationByName
                        (DefaultSpecializationNames.TRANSFORMATION_SPECIALIZATION.getName()));
        Assertions.assertEquals(distributionBusinessSpecialization,
                supplyChainPoint.getBusinessSpecializationByName
                        (DefaultSpecializationNames.DISTRIBUTION_SPECIALIZATION.getName()));
        Assertions.assertEquals(resaleBusinessSpecialization,
                supplyChainPoint.getBusinessSpecializationByName
                        (DefaultSpecializationNames.RESALE_SPECIALIZATION.getName()));
    }

    @Test
    void getBusinessSpecializationList() {
        Assertions.assertEquals(0,supplyChainPoint.getBusinessSpecializationList().size());

        IBusinessSpecialization productionBusinessSpecialization = new ProductionSpecialization();
        IBusinessSpecialization transformationBusinessSpecialization = new TransformationSpecialization();
        IBusinessSpecialization distributionBusinessSpecialization = new DistributionSpecialization();
        IBusinessSpecialization resaleBusinessSpecialization = new ResaleSpecialization();

        supplyChainPoint.addBusinessSpecialization(productionBusinessSpecialization);
        supplyChainPoint.addBusinessSpecialization(transformationBusinessSpecialization);
        supplyChainPoint.addBusinessSpecialization(distributionBusinessSpecialization);
        supplyChainPoint.addBusinessSpecialization(resaleBusinessSpecialization);

        Assertions.assertEquals(4,supplyChainPoint.getBusinessSpecializationList().size());
    }

}