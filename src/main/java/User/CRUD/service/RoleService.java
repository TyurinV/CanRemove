package User.CRUD.service;

import User.CRUD.model.Role;

import java.util.List;

public interface RoleService {
    Role getRoleByName(String name);

    void addRole(Role role);

    List<Role> getAllRoles();
}
