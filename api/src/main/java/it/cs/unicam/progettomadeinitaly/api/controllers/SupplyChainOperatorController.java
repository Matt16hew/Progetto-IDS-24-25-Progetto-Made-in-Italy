package it.cs.unicam.progettomadeinitaly.api.controllers;

import it.cs.unicam.progettomadeinitaly.api.supplychain.ISupplyChainPoint;

import java.util.List;

/**
 * Represents a controller that handles supply chain operators interactions on the system.
 */
public abstract class SupplyChainOperatorController implements UserController  {

    /**
     * Creates a new content to upload to a supply chain point
     * chosen from a list of supply chain points.
     * The new content will have an author.
     *
     * @param author the author of the new content
     * @param supplyChainPoints the supply chain points from where
     *        a supply chain point will be chosen as bearer of the new content.
     * @return true if the new content is successfully uploaded to the chosen supply chain point,
     *         false if there are no supply chain points where to add the new content.
     */
    public abstract boolean createContent(String author, List<ISupplyChainPoint> supplyChainPoints);

}
