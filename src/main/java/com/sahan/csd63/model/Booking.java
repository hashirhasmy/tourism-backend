package com.sahan.csd63.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="booking")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String check_in;
    private String check_out;
    private String no_rooms;
    private String no_guest;
    private String message;

    public Booking() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public String getNo_rooms() {
        return no_rooms;
    }

    public void setNo_rooms(String no_rooms) {
        this.no_rooms = no_rooms;
    }

    public String getNo_guest() {
        return no_guest;
    }

    public void setNo_guest(String no_guest) {
        this.no_guest = no_guest;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


