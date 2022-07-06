package com.dmdev.oop.homework1;

public class MyHomeRunner {
    public static void main(String[] args) {

        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(false);
        Room room4 = new Room(false);
        Room room5 = new Room(false);

        Flat flat1 = new Flat(1, new Room[]{room1,room2, room3});
        Flat flat2 = new Flat(2, new Room[]{room4});
        Flat flat3 = new Flat(3, new Room[]{room5});

        Floor floor1 = new Floor(1,new Flat[]{flat2, flat3});
        Floor floor2 = new Floor(2,new Flat[]{flat1});

        House house = new House(1,new Floor[]{floor1, floor2});

       printAllInformation(house);

    }

    public static void printAllInformation(House house){
        house.print();

    }

}
