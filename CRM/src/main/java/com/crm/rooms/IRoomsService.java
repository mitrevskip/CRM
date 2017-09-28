/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.rooms;

import java.util.List;

/**
 *
 * @author Mario HP
 */
public interface IRoomsService {
    
       List<Rooms> getAllRooms();
    Rooms getRoomsById(Rooms roomID);
    boolean addRoom(Rooms room);
    void updateRoom(Rooms room);
    void deleteRoom(Rooms room);
     

    public boolean RoomExists(Rooms room);
    
}
