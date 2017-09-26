/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces.crm;

import com.models.crm.User;
import java.util.List;


public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int userID);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    boolean userExists(String userName, String email)
    
    void saveUserDAO(User u);
    void updateUserDAO(User u);
    void deleteUserDAO(User u);
    
    
}
