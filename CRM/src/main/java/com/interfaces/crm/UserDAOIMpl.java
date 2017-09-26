/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces.crm;

import com.models.crm.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserDAOIMpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public User getUserById(int userID) {
        return entityManager.find(User.class, userID);
    }
    
    @Override
    public List<User> getAllUsers() {
        String hq1 = "FROM User as usr ORDER BY usr.userID";
        return (List<User>) entityManager.createQuery(hq1).getResultList();
    }
    
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
       User usr1 = getUserById(user.getUserID());
       usr1.setUserName(user.getUserName());
       usr1.setEmail(user.getEmail());
       usr1.setPassword(user.getPassword());
       entityManager.flush();
    }

    @Override
    public void deleteUser(int userID) {
        entityManager.remove(getUserById(userID));
    }

    @Override
    public boolean userExists(String userName, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveUserDAO(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUserDAO(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUserDAO(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}