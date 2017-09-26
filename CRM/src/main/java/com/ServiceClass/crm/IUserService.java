/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ServiceClass.crm;

import com.models.crm.User;
import java.util.List;


public interface IUserService {
    
    List<User> getAllUsers();
    User getUserById(int userID);
    boolean addUser(User user);
    void updateUser(User user);
    void deleteUser(int userID);
}
