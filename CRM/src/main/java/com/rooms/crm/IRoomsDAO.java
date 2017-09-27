/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rooms.crm;

import java.util.List;


/**
 *
 * @author Mario HP
 */
public interface IRoomsDAO {
    
    List<Rooms> getAllRooms();
    Rooms getRoomsById(int roomID);
    void addRoom(Rooms room);
    void updateRoom(Rooms room);
    void deleteRoom(int room);
    boolean RoomExists(String roomName);    
    
    
}
