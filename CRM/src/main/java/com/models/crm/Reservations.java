/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models.crm;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table(name = "RESERVATIONS")
public class Reservations implements Serializable {
    @Id
    private int reservationID;
    private int roomID;
    private int dateForReservations;
    private int timeFromReservations;
    private int timeToReservation;

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }
}
