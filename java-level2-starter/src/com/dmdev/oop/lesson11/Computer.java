package com.dmdev.oop.lesson11;

public class Computer {
    private Ram ram;
    private Ssd ssd;
    private static int counter = 0;

    public Computer(Ram ram, Ssd ssd){
        this.ram = ram;
        this.ssd = ssd;


    }

    public static int getCounter() {
        return counter;
    }

    public void load() {
        System.out.println("Я загрузился");
    }

}
