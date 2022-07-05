package com.dmdev.oop.homework1;

public class House {
    private int houseNumber;

    private Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    void print(){
        System.out.println("House number is: " + houseNumber + " Floors count: " + floors.length);
        for (Floor floor: floors) {
            System.out.println(floor.getFloorNumber());
        }

    }

}
