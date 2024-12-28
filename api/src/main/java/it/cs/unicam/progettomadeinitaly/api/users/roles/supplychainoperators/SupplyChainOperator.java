package it.cs.unicam.progettomadeinitaly.api.users.roles.supplychainoperators;

import it.cs.unicam.progettomadeinitaly.api.supplychain.ISupplyChainPoint;
import it.cs.unicam.progettomadeinitaly.api.users.roles.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a supply chain operator in the system.
 * A supply chain operator manages supply chain points mainly via content upload.
 *
 * @author Matteo Emidio Bruni
 */
public abstract class SupplyChainOperator implements Role {

    private final String roleName;

    protected final List<ISupplyChainPoint> managedSupplyChainPoints;

    public SupplyChainOperator(String roleName) {
        if (roleName == null)
            throw new NullPointerException("Role name is null");
        this.roleName = roleName;
        this.managedSupplyChainPoints = new ArrayList<>();
    }

    /**
     * Creates a new content that will be associated to a
     * managed supply chain point of choice.
     *
     * @return true the content has been successfully created and uploaded.
     */
    public abstract boolean createContent();

    /**
     * Adds as a supply chain point to the supply chain points
     * managed by this supply chain operator.
     *
     * @param supplyChainPoint the new supply chain point to manage.
     * @return true if the supply chain point has been added successfully,
     *         false if the supply chain point was already managed by this
     *         supply chain operator.
     */
    public boolean addManagedSupplyChainPoint(ISupplyChainPoint supplyChainPoint) {
        if (supplyChainPoint == null)
            throw new NullPointerException("Attempt to add a null SupplyChainPoint");
        if (this.managedSupplyChainPoints.contains(supplyChainPoint))
            return false;
        return this.managedSupplyChainPoints.add(supplyChainPoint);
    }

    @Override
    public String getRoleName() {
        return this.roleName;
    }

    public List<ISupplyChainPoint> getManagedSupplyChainPoints() {
        return this.managedSupplyChainPoints;
    }

}
