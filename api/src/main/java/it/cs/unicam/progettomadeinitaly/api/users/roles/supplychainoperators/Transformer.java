package it.cs.unicam.progettomadeinitaly.api.users.roles.supplychainoperators;

import it.cs.unicam.progettomadeinitaly.api.users.roles.DefaultRoleNames;

/**
 * Represents a transformer in the supply chain.
 *
 * @author Matteo Emidio Bruni
 */
public class Transformer extends SupplyChainOperator implements Seller<Transformer> {

    public Transformer() {
        super(DefaultRoleNames.TRANSFORMER_ROLE.getName());
    }

    @Override
    public boolean sellProduct() {
        return false;
    }

}
