package it.cs.unicam.progettomadeinitaly.api.users.roles.supplychainoperators;

/**
 * Represents a seller of products in the system.
 *
 * @author Matteo Emidio Bruni
 */
public interface Seller<T extends SupplyChainOperator> {

    /**
     *
     *
     * @return true if the chosen product has been set on sale successfully
     */
    boolean sellProduct();

}
