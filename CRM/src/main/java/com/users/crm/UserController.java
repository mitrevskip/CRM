/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users.crm;

import java.util.List;
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
    String userController() {
        return "Controlling Users";
    }
    
    
}
