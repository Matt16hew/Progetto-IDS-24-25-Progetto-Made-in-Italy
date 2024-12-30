package it.cs.unicam.progettomadeinitaly.api.users.roles.supplychainoperators;

import it.cs.unicam.progettomadeinitaly.api.users.roles.DefaultRoleNames;

/**
 * Represents a distributor in the supply chain.
 *
 * @author Matteo Emidio Bruni
 */
public class Distributor extends SupplyChainOperator implements Seller<Distributor> {

    public Distributor() {
        super(DefaultRoleNames.DISTRIBUTOR_ROLE.getName());
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
