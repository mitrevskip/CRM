/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ServiceClass.crm;

import com.models.crm.User;

/**
 *
 * @author Mario HP
 */
public interface UserService {
    
    User findById(int id);
    
    void saveUser(User u);
    void updateUser(User u);
    void deleteUser(User u);
}
