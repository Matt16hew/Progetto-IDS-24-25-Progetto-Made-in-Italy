package it.cs.unicam.progettomadeinitaly.api.users.roles.supplychainoperators;

import it.cs.unicam.progettomadeinitaly.api.users.roles.DefaultRoleNames;

/**
 * Represents a producer in the supply chain.
 *
 * @author Matteo Emidio Bruni
 */
public class Producer extends SupplyChainOperator implements Seller<Producer> {

    public Producer() {
        super(DefaultRoleNames.PRODUCER_ROLE.getName());
    }

    @Override
    public boolean createContent() {
        return true;
    }

    @Override
    public boolean sellProduct() {
        return false;
    }

}
