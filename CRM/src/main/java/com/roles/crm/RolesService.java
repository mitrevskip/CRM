/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roles.crm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
@EnableAutoConfiguration
public class RolesService implements IRolesService {

    @Autowired
    private IRolesService rolesDAO;

    @Override
    public Roles getRolesById(int rolesId) {
        Roles obj = rolesDAO.getRolesById(rolesId);
        return obj;
    }

    @Autowired
    @Override
    public List<Roles> getAllRoles() {
        return rolesDAO.getAllRoles();
    }

    @Override
    public synchronized boolean addRoles (Roles roles) {
        if(rolesDAO.rolesExists(roles.getRolesID(), roles.getAdministrator())){
            return false;
        }else{
            rolesDAO.addRoles(roles);
            return true;
        }
    }
    
    @Override
    public void updateRoles (Roles roles) {
        rolesDAO.updateRoles(roles);
    }
    
    @Override
    public void deleteRoles (int rolesId) {
        rolesDAO.deleteRoles(rolesId);
    }
    
    @Override
    public boolean rolesExists(int rolesId, int administrator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
