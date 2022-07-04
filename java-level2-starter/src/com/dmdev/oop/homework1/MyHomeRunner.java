package com.dmdev.oop.homework1;

public class MyHomeRunner {
    public static void main(String[] args) {

        Floor floor = new Floor(1, new int[]{1,2,3,4,5});
        floor.print();
        Flat flat = new Flat(1, new int[]{1,2,3});
        flat.print();
    }
}
