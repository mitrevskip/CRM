/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rooms.crm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mario HP
 */
@Service
public class RoomsService implements IRoomsService{

    @Autowired
    private IRoomsService roomService;
    
    @Override
    public List<Rooms> getAllRooms() {
        return roomService.getAllRooms();
    }

    @Override
    public Rooms getRoomsById(Rooms roomID) {
        Rooms obj = roomService.getRoomsById(roomID);
        return obj;
    }

    @Override
    public synchronized boolean addRoom(Rooms room) {
        if(roomService.RoomExists(room)){
            return false;}
            else
        {
             roomService.addRoom(room);
             return true;
        }
    }

    @Override
    public void updateRoom(Rooms room) {
        roomService.updateRoom(room);
    }

    @Override
    public void deleteRoom(Rooms room) {
        roomService.deleteRoom(room);
    }

   

    @Override
    public boolean RoomExists(Rooms room) {
 if(roomService.RoomExists(room)){
            return false;}
            else
        {
             
             return true;
        }    }

  
    
}
