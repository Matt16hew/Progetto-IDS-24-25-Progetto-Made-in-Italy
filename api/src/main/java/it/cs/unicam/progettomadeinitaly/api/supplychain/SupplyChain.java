package it.cs.unicam.progettomadeinitaly.api.supplychain;

import java.util.ArrayList;
import java.util.List;

// TODO review (non è chiara la sua esistenza)

/**
 * @author Pietro Villa
 */
public class SupplyChain {

    private String name;

    private final List<SupplyChainPoint> supplyChainPoints;

    public SupplyChain(String name) {
        if (name == null)
            throw new NullPointerException();
        this.name = name;
        this.supplyChainPoints = new ArrayList<>();
    }

}
