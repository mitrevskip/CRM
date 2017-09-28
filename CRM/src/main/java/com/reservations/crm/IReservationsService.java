/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reservations.crm;

import java.util.List;

/**
 *
 * @author Petar
 */
public interface IReservationsService {
    
    List<Reservations> getAllReservations();
    
    
    Reservations getReservationById(int resId);
    
    boolean addReservation(Reservations reservations);
    
    void updateReservations (Reservations reservations);
    
    void deleteReservations (int resId);
    
    public boolean reservationsExists(int resId);
    
    
    
}
