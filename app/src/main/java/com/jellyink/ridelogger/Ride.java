package com.jellyink.ridelogger;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;

/**
 * Created by jessielink on 1/21/15.
 */
public class Ride {

    private String title;
    private String notes;
    private Interval rideInterval;
    private Integer id;
    private Double distance;

    public Ride(String title, String notes, Interval rideInterval, Integer id, Double distance) {
        this.title = title;
        this.notes = notes;
        this.id = id;
        this.distance = distance;
        this.rideInterval = rideInterval;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
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

    public Interval getRideInterval() {
        return rideInterval;
    }

    public void setRideInterval(DateTime startTime, DateTime endTime) {
        this.rideInterval = new Interval(startTime, endTime);
    }

    public DateTime getStartDate() {
        return this.rideInterval.getStart();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
