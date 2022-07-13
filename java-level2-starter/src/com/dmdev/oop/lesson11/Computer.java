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

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public static void setCounter(int counter) {
        Computer.counter = counter;
    }
}
