package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

/**
 * A compendium of all the default business specialization names.
 * A business specialization name is useful in the recognition of
 * business specializations that a supply chain point may have.
 *
 * @author Pietro Villa
 */
public enum DefaultSpecializationNames {

    PRODUCTION_SPECIALIZATION("PRODUCTION_SPECIALIZATION"),

    TRANSFORMATION_SPECIALIZATION("TRANSFORMATION_SPECIALIZATION"),

    DISTRIBUTION_SPECIALIZATION("DISTRIBUTION_SPECIALIZATION"),

    RESALE_SPECIALIZATION("RESALE_SPECIALIZATION");

    private final String name;

    DefaultSpecializationNames(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
