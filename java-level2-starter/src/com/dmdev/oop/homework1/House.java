package com.dmdev.oop.homework1;

public class House {
    private int number;
    private int[] floors;

    public House(int number, int[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    void print(){
        System.out.println("House: " + number + " Floors count: " + floors.length);
    }

}
