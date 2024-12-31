package it.cs.unicam.progettomadeinitaly.api.controllers;

import it.cs.unicam.progettomadeinitaly.api.supplychain.ISupplyChainPoint;

import java.util.List;

/**
 * Represents a controller that handles distributor interactions on the system.
 */
public class DistributorController extends SupplyChainOperatorController {

    public boolean createContent(String author, List<ISupplyChainPoint> supplyChainPoints) {
        return true;
    }

}
