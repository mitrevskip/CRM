/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roles.crm;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Petar
 */
@Controller
@EnableAutoConfiguration
public class RolesControler {

    @RequestMapping("/")
    @ResponseBody
    String rolescontrol() {
        return "controling roles.";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(RolesControler.class, args);
    }
    
}
