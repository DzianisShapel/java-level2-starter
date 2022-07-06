package com.dmdev.oop.homework1;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public void print() {
        System.out.println("Floor: " + floorNumber + " Flats count: " + flats.length);
        for (Flat flat : flats) {
            flat.print();
        }
    }

}
