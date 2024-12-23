package it.cs.unicam.progettomadeinitaly.api.users.roles;

import it.cs.unicam.progettomadeinitaly.api.supplychain.SupplyChainPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matteo Emidio Bruni
 */
public abstract class SupplyChainOperator implements Role {

    private final String roleName;

    private final List<SupplyChainPoint> managedSupplyChainPoints;

    public SupplyChainOperator(String roleName) {
        this.roleName = roleName;
        this.managedSupplyChainPoints = new ArrayList<>();
    }

    @Override
    public String getRoleName() {
        return this.roleName;
    }

    public List<SupplyChainPoint> getManagedSupplyChainPoints() {
        return this.managedSupplyChainPoints;
    }

}
