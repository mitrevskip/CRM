/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rooms.crm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mario HP
 */
@Transactional
@Repository
public class RoomsDAO implements IRoomsDAO{
    
    
    @PersistenceContext
    private EntityManager entityManager;
    
  
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Rooms> getAllRooms() {
        String hq1 = "FROM Rooms as rooms1 ORDER BY rooms1.roomId";
        return (List<Rooms>) entityManager.createQuery(hq1).getResultList();
    }
    
    
   @Override
    public boolean RoomExists(String roomName) {
          String hq1 = "FROM ROOMS as rooms1 WHERE rooms1.roomname = ?";
        int count = entityManager.createQuery(hq1).setParameter(1, roomName).getResultList().size();
        return count > 0 ? true : false;
    }

    
    @Override
    public void addRoom(Rooms room) {
        entityManager.persist(room);   
    }

   
    @Override
    public void updateRoom(Rooms room) {
       Rooms rooms1 = getRoomsById(room.getRoomID());
       rooms1.setRoomName(room.getRoomName());
       rooms1.setDescription(room.getDescription());
       rooms1.setCapacity(room.getCapacity());
        
        entityManager.flush();   
    }
    
    @Override
    public Rooms getRoomsById(int roomID) {
        return entityManager.find(Rooms.class, roomID);
    }

    @Override
    public void deleteRoom(int room) {
        entityManager.remove(getRoomsById(room));
    }

   
}
