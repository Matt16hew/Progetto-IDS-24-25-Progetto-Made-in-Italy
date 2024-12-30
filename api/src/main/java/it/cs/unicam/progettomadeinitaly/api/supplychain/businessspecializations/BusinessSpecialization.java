package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

/**
 * An abstraction of a business specialization type of object.
 *
 * @author Pietro Villa
 */
public abstract class BusinessSpecialization implements IBusinessSpecialization {

    private final String name;

    public BusinessSpecialization(String name) {
        if (name == null)
            throw new NullPointerException("Business specialization name cannot be null");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
