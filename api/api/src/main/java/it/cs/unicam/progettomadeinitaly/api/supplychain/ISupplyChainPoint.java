package it.cs.unicam.progettomadeinitaly.api.supplychain;

import it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations.IBusinessSpecialization;

import java.util.List;

/**
 * Represents a supply chain point in the supply chain environment.
 * Based on which business specializations a supply chain point has,
 * a supply chain point will be enabled to manage certain contents.
 *
 * @author Pietro Villa
 */
public interface ISupplyChainPoint {

    /**
     * Adds a business specialization to this supply chain point if not already present.
     * @param businessSpecialization the business specialization to add
     * @throws NullPointerException if null is passed instead of a business specialization
     * @return true if the business specialization has successfully been added,
     *         false if the business specialization was already present.
     */
    boolean addBusinessSpecialization(IBusinessSpecialization businessSpecialization);

    int getId();

    String getName();

    Coordinate getCoordinate();

    /**
     * Gets a business specialization by its name.
     * @param name the name of the desired business specialization.
     * @throws NullPointerException if the passed name is null.
     * @throws IllegalArgumentException if the business specialization list is empty.
     * @throws IllegalArgumentException if the passed name is not a registered business
     *                                  specialization name.
     * @return the desired business specialization.
     */
    IBusinessSpecialization getBusinessSpecializationByName(String name);

    List<IBusinessSpecialization> getBusinessSpecializationList();

}
