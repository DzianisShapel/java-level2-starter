package com.dmdev.oop.homework1;

public class Floor {
    private int number;
    private int[] flatsCount;
    private  Flat flats;

    public Floor(int number, int[] flatsCount, Flat flats) {
        this.number = number;
        this.flatsCount = flatsCount;
        this.flats = flats;
    }



    public void print(){
        System.out.println("Floor: " + number + " Flats count: " + flatsCount.length);
    }

}
