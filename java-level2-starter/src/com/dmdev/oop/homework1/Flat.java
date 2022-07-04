package com.dmdev.oop.homework1;

public class Flat {
    private int number;
    private  int[] rooms;

    public Flat(int number,  int[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getValue(){
        return number;
    }

    public void setValue(int number, int[] rooms){
        this.number = number;
        this.rooms = rooms;
    }

    public void print(){
        System.out.println("Flat: " + number + " Rooms count: " + rooms.length);
    }

}
