package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {

    public int id;
    private String name;
    private String check_in;
    private String check_out;

    public Hotel() {
    }

    public Hotel(int id, String name, String check_in, String check_out) {
        this.id = id;
        this.name = name;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
