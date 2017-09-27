/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users.crm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    

    @Autowired
    private IUserService userDAO;

    @Override
    public User getUserById(int UserId) {
        User obj = userDAO.getUserById(UserId);
        return obj;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        if (userDAO.userExists(user.getUserName(), user.getEmail())) {
            return false;
        } else {
            userDAO.addUser(user);
           return true;
        }
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDAO.deleteUser(userId);
    }

    @Override
    public boolean userExists(String userName, String email) {
        if(userDAO.userExists(userName, email))return false;
        else return true;
    }

//    @Override
//    public void findByLogin(String userName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

}
