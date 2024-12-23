package it.cs.unicam.progettomadeinitaly.api.supplychain;

import it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations.BusinessSpecialization;

import java.util.List;

// TODO possibile aggiunta di una interfaccia ISupplyChainPoint
/**
 * Represents a supply chain point in the supply chain environment
 * @author Pietro Villa
 */
public class SupplyChainPoint {

    private String name;

    private final Coordinate coordinate;

    private final List<BusinessSpecialization> businessSpecializationList;

    public SupplyChainPoint(String name, Coordinate coordinate, List<BusinessSpecialization> businessSpecializationList) {
        if (name == null)
            throw new NullPointerException("A supply chain point must have a name");
        if (coordinate == null)
            throw new NullPointerException("A supply chain point must have a coordinate");
        if (businessSpecializationList == null)
            throw new NullPointerException("A supply chain point must have at least a single business specialization");
        if (businessSpecializationList.isEmpty())
            throw new IllegalArgumentException("A supply chain point must have at least a single business specialization");
        this.name = name;
        this.coordinate = coordinate;
        this.businessSpecializationList = businessSpecializationList;
    }

    // TODO Possibile caso d'uso futuro
    /**
     * Adds a business specialization to this supply chain point if not already present
     * @param businessSpecialization the business specialization to add
     * @throws NullPointerException if null is passed instead of a business specialization
     * @return true if the business specialization has successfully been added,
     *         false if the business specialization was already present
     */
    public boolean addBusinessSpecialization(BusinessSpecialization businessSpecialization) {
        if (businessSpecialization == null)
            throw new NullPointerException("A supply chain point must have a business specialization");
        for (BusinessSpecialization businessSpec : businessSpecializationList)
            if (businessSpecialization.getName().equals(businessSpec.getName())) {
                // Business specialization is already applied to this supply chain point
                return false;
            }
        return businessSpecializationList.add(businessSpecialization);
    }

    public String getName() {
        return name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public List<BusinessSpecialization> getBusinessSpecializationList() {
        return businessSpecializationList;
    }

}
