package it.cs.unicam.progettomadeinitaly.api.users;

import it.cs.unicam.progettomadeinitaly.api.users.roles.Role;

/**
 * @author Matteo Emidio Bruni
 */
public class User {

    private String name;

    private String password;

    private Role role;

    public User(String name, String password, Role role) {
        if (name == null || password == null || role == null)
            throw new NullPointerException("Name or password or role is null");
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

}
