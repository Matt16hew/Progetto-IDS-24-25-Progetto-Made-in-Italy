package it.cs.unicam.progettomadeinitaly.api.users;

import it.cs.unicam.progettomadeinitaly.api.users.roles.Role;

/**
 * Represents a user on the platform.
 *
 * @author Matteo Emidio Bruni
 */
public interface IUser {

    String getName();

    String getPassword();

    Role getRole();

    void setRole(Role role);

}
