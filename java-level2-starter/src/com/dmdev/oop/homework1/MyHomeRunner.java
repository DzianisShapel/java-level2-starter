package com.dmdev.oop.homework1;

public class MyHomeRunner {
    public static void main(String[] args) {

        Room room = new Room(true);
        room.print();
        Flat flat = new Flat(2, new int[]{1,2,3,4}, room);
        flat.print();
        Floor floor = new Floor(5, new int[]{1,2,3}, flat);
        floor.print();
        House house = new House(5, new int[]{1,2,3,4,5,6}, floor, flat, room);
        house.print();



    }

    public static void printAllInformation(House house){

    }

}
