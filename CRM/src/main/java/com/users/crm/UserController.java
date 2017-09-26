/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users.crm;

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
public class UserController {
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
    }
    
}
