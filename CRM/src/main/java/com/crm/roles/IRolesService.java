/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.roles;

import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRolesService {
    List<Roles> getAllRoles();
    
    Roles getRolesById(int roleId);
    
    boolean addRoles(Roles roles);
    
    void updateRoles(Roles roles);
    
    void deleteRoles(int rolesId);
    
    public boolean rolesExists(int rolesId, int administrator);
}
