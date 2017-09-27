/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users.crm;

import java.util.List;


public interface IUserService {
    
    List<User> getAllUsers();
    
    User getUserById(int userId);
    
    boolean addUser(User user);
    
    void updateUser(User user);
    
    void deleteUser(int userId);

    public boolean userExists(String userName, String email);
    
//    public void findByLogin(final String userName);
}
