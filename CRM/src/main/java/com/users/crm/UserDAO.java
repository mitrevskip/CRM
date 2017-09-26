/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users.crm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Petar
 */
@Transactional
@Repository
public class UserDAO implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(int userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    public List<User> getAllUsers() {
        String hq1 = "FROM User as usr1 ORDER BY usr1.userId";
        return (List<User>) entityManager.createQuery(hq1).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        User usr1 = getUserById(user.getUserId());
        usr1.setUserName(userName.getUserName());
        usr1.setEmail(user.getEmail());
        usr1.setPassword(user.getPassword());
        entityManager.flush();
    }

    public boolean userExists(String userName, String email) {
        String hq1 = "FROM Article as usr1 WHERE usr1.userName = ? and usr1.email = >";
        int count = entityManager.createQuery(hq1).setParameter(1, userName)
                .setParameter(2, email).getResultList().size();
        return count > 0 ? true : false;
    }

}
