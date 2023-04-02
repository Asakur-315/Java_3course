package com.pract3.trains.models;


import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "train")
    private Train train;

    @ManyToOne
    @JoinColumn(name="from")
    private City cityFrom;

    @ManyToOne
    @JoinColumn(name="to")
    private City cityTo;

    private Date start_time, arrive_time;

    public Integer getId() {
        return id;
    }
    public City getCityFrom() {
        return cityFrom;
    }
    public City getCityTo() {
        return cityTo;
    }
    public Date getStartTime() {
        return start_time;
    }
    public Date getArriveTime() {
        return arrive_time;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setCityFrom(City from) {
        this.cityFrom = from;
    }
    public void setCityTo(City to) {
        this.cityTo = to;
    }
    public void setStartTime(Date start_time) {
        this.start_time = start_time;
    }
    public void setArriveTime(Date arrive_time) {
        this.arrive_time = arrive_time;
    }
}
