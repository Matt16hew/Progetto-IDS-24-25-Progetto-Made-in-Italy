package it.cs.unicam.progettomadeinitaly.api.users;

import it.cs.unicam.progettomadeinitaly.api.users.roles.Role;

public class User implements IUser {

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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole(Role role) {
        if (role == null)
            throw new NullPointerException("Role is null");
        this.role = role;
    }

}
