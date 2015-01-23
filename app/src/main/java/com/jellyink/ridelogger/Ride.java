package com.jellyink.ridelogger;

import java.util.Date;

/**
 * Created by jessielink on 1/21/15.
 */
public class Ride {

    private String title;
    private String notes;
    private Date rideDateStart;
    private Date rideDateEnd;
    private Integer id;
    // duration
    // bike ID?


    public Ride(String title, String notes, Date rideDateStart, Date rideDateEnd, Integer id) {
        this.title = title;
        this.notes = notes;
        this.rideDateStart = rideDateStart;
        this.rideDateEnd = rideDateEnd;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getRideDateStart() {
        return rideDateStart;
    }

    public void setRideDateStart(Date rideDateStart) {
        this.rideDateStart = rideDateStart;
    }

    public Date getRideDateEnd() {
        return rideDateEnd;
    }

    public void setRideDateEnd(Date rideDateEnd) {
        this.rideDateEnd = rideDateEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
