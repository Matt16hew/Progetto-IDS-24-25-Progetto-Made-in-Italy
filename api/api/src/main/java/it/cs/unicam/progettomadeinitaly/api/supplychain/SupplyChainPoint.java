package it.cs.unicam.progettomadeinitaly.api.supplychain;

import it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations.IBusinessSpecialization;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a supply chain point in the supply chain environment.
 * Based on which business specializations a supply chain point has,
 * a supply chain point will be enabled to manage certain contents.
 *
 * @author Pietro Villa
 */
public class SupplyChainPoint implements ISupplyChainPoint {

    private int id;

    private String name;

    private final Coordinate coordinate;

    private final List<IBusinessSpecialization> businessSpecializationList;

    public SupplyChainPoint(int id, String name, Coordinate coordinate) {
        if (id < 0)
            throw new IllegalArgumentException("Id must be positive or 0 for a SupplyChainPoint");
        if (name == null)
            throw new NullPointerException("A supply chain point must have a name");
        if (coordinate == null)
            throw new NullPointerException("A supply chain point must have a coordinate");
        this.name = name;
        this.coordinate = coordinate;
        this.businessSpecializationList = new ArrayList<>();
    }

    @Override
    public boolean addBusinessSpecialization(IBusinessSpecialization businessSpecialization) {
        if (businessSpecialization == null)
            throw new NullPointerException("A supply chain point must have a business specialization");
        for (IBusinessSpecialization businessSpec : businessSpecializationList)
            if (businessSpecialization.getName().equals(businessSpec.getName()))
                return false;
        return this.businessSpecializationList.add(businessSpecialization);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Override
    public IBusinessSpecialization getBusinessSpecializationByName(String name) {
        if (name == null)
            throw new NullPointerException("Trying to get business specialization by null name");
        if (businessSpecializationList.isEmpty())
            throw new IllegalArgumentException
                    ("Trying to get a business specialization in a empty business specialization list");
        for (IBusinessSpecialization businessSpec : businessSpecializationList)
            if (name.equalsIgnoreCase(businessSpec.getName()))
                return businessSpec;
        throw new IllegalArgumentException
                ("Trying to get a business specialization with an unexpected name");
    }

    @Override
    public List<IBusinessSpecialization> getBusinessSpecializationList() {
        return new ArrayList<>(this.businessSpecializationList);
    }

}
