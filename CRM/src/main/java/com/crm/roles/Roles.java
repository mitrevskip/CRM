/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.roles;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.stereotype.Component;



@Component
public class Roles implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "rolesID")
    private int rolesID;

    @Column(name = "administrator")
    private int administrator;
    
    public int getRolesID() {
        return rolesID;
    }

    public void setRoleID(int rolesID) {
        this.rolesID = rolesID;
    }

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }
    
    
}
