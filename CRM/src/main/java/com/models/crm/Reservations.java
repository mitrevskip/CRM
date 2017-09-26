package com.models.crm;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table(name = "RESERVATIONS")
public class Reservations implements Serializable {

    static final int MINUTES_PER_HOUR = 60;
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

    @Id @GeneratedValue
    @Column(name = "resID")
    private int resID;
    
    @Column(name = "roomID")
    private int roomID;
    
    @Column(name = "meeting starts")
    LocalDateTime meetingStart;
    
    @Column(name = "meeting ends")
    LocalDateTime meetingEnd;
    
    @Column(name = "meeting length")
    Duration meetingLength;

    Period period = getPeriod(meetingStart, meetingEnd);
//    long time[] = getTime(meetingStart, meetingEnd);

    private static Period getPeriod(LocalDateTime meetingStart, LocalDateTime now) {
        return Period.between(meetingStart.toLocalDate(), now.toLocalDate());
    }

//    private static long[] getTime(LocalDateTime now, LocalDateTime meetingStart) {
//        LocalDateTime today = LocalDateTime.of(now.getYear(),
//                now.getMonthValue(), now.getDayOfMonth(), meetingStart.getHour(), meetingStart.getMinute(), meetingStart.getSecond());
//        Duration duration = Duration.between(now, meetingStart);
//
//        long seconds = duration.getSeconds();
//
//        long hours = seconds / SECONDS_PER_HOUR;
//        long minutes = ((seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE);
//        long secs = (seconds % SECONDS_PER_MINUTE);
//
//        return new long[]{hours, minutes, secs};
//    }

}
