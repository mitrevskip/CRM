/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.roles;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Petar
 */
@SpringBootApplication
@RestController
@RequestMapping("/rolesHome")
public class RolesController {
    
    @Autowired
    IRolesService rolesService;

    @GetMapping("RolesService/getAllRoles")
    public String getAllRoles() {
        List<Roles> getRoles = rolesService.getAllRoles();
        
        return "The roles are 1: User, 2: Administrator, 3: SuperAdmnistrator" + getRoles;
    }

//    @RequestMapping(value = "/addRoles", consumes = {"application/JSON", "application/XML"})
//    String addRoles() {
//        //application code
//        return "Adding roles";
//    }
    
//    @RequestMapping(value =)

    
}


