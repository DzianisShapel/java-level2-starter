package com.dmdev.oop.homework1;

public class House {
    private int number;
    private int[] floorsCount;
    private Floor floors;
    private Flat flats;
    private Room room;

    public House() {}

    public House(int number, int[] floorsCount, Floor floors, Flat flats, Room room) {
        this.number = number;
        this.floorsCount = floorsCount;
        /*this.floors = floors;
        this.flats = flats;
        this.room = room;*/
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number, int[] floorsCount) {
        this.number = number;
        this.floorsCount = floorsCount;
    }

    void print(){
        System.out.println("House: " + number + " Floors count: " + floorsCount.length);
    }

}
