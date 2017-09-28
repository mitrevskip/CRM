/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.reservations;

import java.util.List;

/**
 *
 * @author Petar
 */
public interface IReservationsDAO {
    
    List<Reservations> getAllReservations();
    Reservations getReservationsById(int resId);
    void addReservations(Reservations reservations);
    void updateReservations(Reservations reservations);
    void deleteReservations(int resId);
    boolean reservationsExists(int resId);
    
}
