package com.dmdev.oop.lesson2;

public class Computer {

    int ssd = 500;
    int ram;

    Computer(){
        System.out.println("I was created");
    }

    Computer(int newSsd){
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }


    void load(){
        System.out.println("I was loaded");
    }

    void printState(){
        System.out.println("Ssd = " + ssd);
        System.out.println("Ram = " + ram);
        System.out.println();
    }
}
