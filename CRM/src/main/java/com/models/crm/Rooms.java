/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models.crm;

/**
 *
 * @author Petar
 */
public class Rooms {
    private int roomID;
    private int capacity;
    private String roomName;
    private String desc;

    public Rooms(int roomID) {
        this.roomID = roomID;
    }
    
    

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    
    
}
