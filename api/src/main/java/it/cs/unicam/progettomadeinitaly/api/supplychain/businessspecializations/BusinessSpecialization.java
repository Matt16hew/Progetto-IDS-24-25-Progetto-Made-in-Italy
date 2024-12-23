package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

// TODO possibile aggiunta di una interfaccia IBusinessSpecialization
/**
 * Represents a business specialization for a supply chain point
 * @author Pietro Villa
 */
public abstract class BusinessSpecialization {

    private final String name;

    public BusinessSpecialization(String name) {
        if (name == null)
            throw new NullPointerException("Business specialization name cannot be null");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
