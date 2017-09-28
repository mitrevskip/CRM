package com.reservations.crm;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table(name = "Reservations")
public class Reservations implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resID")
    private int resID;

    Instant now = Instant.now();

    @Column
    private int roomID;

    @Column(name = "meeting starts")
    LocalDateTime meetingStart;

    @Column(name = "meeting ends")
    LocalDateTime meetingEnd;
//
//    @Column(name = "meeting length")
//    Duration meetingLength = getMeetingLength(meetingStart, meetingEnd);
//
//    @Column(name = "time to meeting")
//    Duration timeToMeeting = getTimeToMeeting(now, meetingStart);

    


    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public LocalDateTime getMeetingStart() {
        return meetingStart;
    }

    public void setMeetingStart(LocalDateTime meetingStart) {
        this.meetingStart = meetingStart;
    }

    public LocalDateTime getMeetingEnd() {
        return meetingEnd;
    }

    public void setMeetingEnd(LocalDateTime meetingEnd) {
        this.meetingEnd = meetingEnd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
