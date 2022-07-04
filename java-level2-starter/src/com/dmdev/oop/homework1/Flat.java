package com.dmdev.oop.homework1;

public class Flat {
    private int number;
    private int[] rooms;
    private Room IsPassage;

    public Flat(int number, int[] rooms, Room IsPassage) {
        this.number = number;
        this.rooms = rooms;
        this.IsPassage = IsPassage;
    }

    public int getValue(){
        return number;
    }

    public void setValue(int number, Room IsPassage){
        this.number = number;
        this.IsPassage = IsPassage;
    }

    public void print(){
        System.out.println("Flat: " + number + " Rooms count: " + rooms.length);
    }

}
