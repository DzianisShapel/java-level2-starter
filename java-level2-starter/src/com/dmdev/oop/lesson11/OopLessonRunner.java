package com.dmdev.oop.lesson11;

import com.dmdev.oop.lesson11.practice.Laptop;

public class OopLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);

        Computer computer = new Computer(ram, ssd);
        computer.load();

        Laptop laptop = new Laptop(new Ram(512), new Ssd(250),2);
        laptop.load();
        laptop.open();

    }
}
