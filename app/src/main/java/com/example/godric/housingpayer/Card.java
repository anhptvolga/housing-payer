package com.example.godric.housingpayer;

/**
 * Created by godric on 18.05.2016.
 */
public class Card {
    private String owner;
    private int year;
    private String number;

    public Card(String number, int year, String owner) {
        this.number = number;
        this.year = year;
        this.owner = owner;
    }

    /////////////////// setters and getter
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}