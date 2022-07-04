package com.dmdev.oop.homework1;

public class Floor {
    private int number;
    private  int[] flats;


    public Floor(int number,  int[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public int getValue(){
        return number;
    }

    public void setValue(int number, int[] flats){
        this.number = number;
        this.flats = flats;
    }

    public void print(){
        System.out.println("Floor: " + number + " Flats count: " + flats.length);
    }

}
