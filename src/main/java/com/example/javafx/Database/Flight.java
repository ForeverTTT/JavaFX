package com.example.javafx.Database;

public class Flight {
    private Integer id;
    private String flightname;
    private String from;
    private String to;
    private Integer price;

    public Flight() {
    }

    public Flight(Integer id, String flightname) {
        this.id = id;
        this.flightname = flightname;
    }

    public Flight(Integer id, String flightname, String from, String to, Integer price) {
        this.id = id;
        this.flightname = flightname;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
