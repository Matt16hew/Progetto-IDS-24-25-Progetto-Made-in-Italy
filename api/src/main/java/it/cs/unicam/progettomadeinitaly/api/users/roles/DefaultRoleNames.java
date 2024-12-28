package it.cs.unicam.progettomadeinitaly.api.users.roles;

/**
 * A compendium of all the default role names.
 * A role name is useful in the recognition of a role a user may have.
 *
 * @author Matteo Emidio Bruni
 */
public enum DefaultRoleNames {

    PRODUCER_ROLE("PRODUCER_ROLE"),

    TRANSFORMER_ROLE("TRANSFORMER_ROLE"),

    DISTRIBUTOR_ROLE("DISTRIBUTOR_ROLE");

    private final String name;

    DefaultRoleNames(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
