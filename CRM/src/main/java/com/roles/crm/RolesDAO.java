/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roles.crm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Petar
 */
@Transactional
@Repository
public class RolesDAO implements IRolesDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping
    @Override
    public Roles getRolesById(int rolesId) {
        return entityManager.find(Roles.class, rolesId);
    }
    
    @RequestMapping(value = "/methodGetAll")  
    @SuppressWarnings("unchecked")
    @Override
    public List<Roles> getAllRoles() {
        String hql = "FROM Roles as role1 ORDER BY role1.rolesId";
        return (List<Roles>) entityManager.createQuery(hql).getResultList();
    }

    @RequestMapping(value = "/methodAddRoles")
    @Override
    public void addRoles(Roles roles) {
        entityManager.persist(roles);
    }
    
    @RequestMapping(value = "/methodUpdateRoles")
    @Override
    public void updateRoles(Roles roles) {
        Roles role1 = getRolesById(roles.getRolesID());
        role1.setRoleID(role1.getRolesID());
        role1.setAdministrator(role1.getAdministrator());
        entityManager.flush();
    }

    @RequestMapping(value = "/methodDeleteRoles")
    @Override
    public void deleteRoles(int rolesId) {
        entityManager.remove(getRolesById(rolesId));
    }

    @RequestMapping(value = "/methodRolesExists")
    @Override
    public boolean rolesExists(int rolesId, int administrator) {
        String hql = "FROM Roles as roles1 WHERE roles1.rolesId = ? and roles1.administrator = ?";
        int count = entityManager.createQuery(hql).setParameter(1, rolesId)
                .setParameter(2, administrator).getResultList().size();
        return count > 0 ? true : false;
    }

}
