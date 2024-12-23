package it.cs.unicam.progettomadeinitaly.api.users.roles;

/**
 * @author Matteo Emidio Bruni
 */
public class Producer extends SupplyChainOperator implements Seller<Producer> {

    public Producer() {
        super("PRODUCER_ROLE");
    }

    @Override
    public boolean sellProduct() {
        return false;
    }

}
