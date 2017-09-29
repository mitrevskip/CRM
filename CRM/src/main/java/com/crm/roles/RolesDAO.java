/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.roles;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Petar
 */
@Transactional
public class RolesDAO implements IRolesDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Roles getRolesById(int rolesId) {
        return entityManager.find(Roles.class, rolesId);
    }

    @Override
    public List<Roles> getAllRoles() {
        String hql = "FROM Roles";
        return (List<Roles>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addRoles(Roles roles) {
        entityManager.persist(roles);
    }

    @Override
    public void updateRoles(Roles roles) {
        Roles role1 = getRolesById(roles.getRolesID());
        role1.setRoleID(role1.getRolesID());
        role1.setAdministrator(role1.getAdministrator());
        entityManager.flush();
    }

    @Override
    public void deleteRoles(int rolesId) {
        entityManager.remove(getRolesById(rolesId));
    }


    @Override
    public boolean rolesExists(int rolesId, int administrator) {
        String hql = "FROM Roles";
        int count = entityManager.createQuery(hql).setParameter(1, rolesId)
                .setParameter(2, administrator).getResultList().size();
        return count > 0 ? true : false;
    }

}
