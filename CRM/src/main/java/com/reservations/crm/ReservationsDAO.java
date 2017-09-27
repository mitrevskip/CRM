/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reservations.crm;

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
public class ReservationsDAO implements IReservationsDAO{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<Reservations> getAllReservations() {
        String hql = "FROM Reservations as reservations1 ORDER BY reservations1.resId";
        return (List<Reservations>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Reservations getReservationsById(int resId) {
        return entityManager.find(Reservations.class, resId);
    }

    @Override
    public void addReservations(Reservations reservations) {
        entityManager.persist(reservations);
    }

    @Override
    public void updateReservations(Reservations reservations) {
        Reservations reservations1 = getReservationsById(reservations.getResID());
        reservations1.setMeetingStart(reservations.getMeetingStart());
        reservations1.setMeetingEnd(reservations.getMeetingEnd());
        entityManager.flush();
    }

    @Override
    public void deleteReservations(int resId) {
        entityManager.remove(getReservationsById(resId));
    }

    @Override
    public boolean reservationsExists(int resId) {
        String hql = "FROM Reservations as reservations1 WHERE reservations1.resId = ?";
        int count = entityManager.createQuery(hql).setParameter(1, resId).getResultList().size();
        return count > 0? true : false;
    
    }
    
    
    
}
