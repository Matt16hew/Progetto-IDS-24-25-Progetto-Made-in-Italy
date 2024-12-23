package it.cs.unicam.progettomadeinitaly.api.users.roles;

/**
 * @author Matteo Emidio Bruni
 */
public interface Seller<T extends SupplyChainOperator> {

    boolean sellProduct();

}
