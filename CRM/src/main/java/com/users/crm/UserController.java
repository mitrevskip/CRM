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
    
    
    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
        SpringApplication.run(com.reservations.crm.ReservationsController.class, args);
        
       
        
        
        
        
//        IUserDAO iUserDAO = new UserDAO();
//       
//       //Add new Users
//       
//       User petar = new User();
//       petar.setEmail("mitrevski.p@gmail.com");
//       petar.setPassword("terenec");
//       petar.setUserName("mitrevski");
//       petar.setUserId(2);
//       
//       iUserDAO.addUser(petar);
//       
        
        
    }
    
}
