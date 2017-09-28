/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roles.crm;

import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRolesDAO {
    
    List<Roles> getAllRoles();
    Roles getRolesById(int administrator);
    void addRoles(Roles roles);
    void updateRoles(Roles roles);
    void deleteRoles(int administrator);
    boolean rolesExists(int rolesId, int administrator);
    
}
