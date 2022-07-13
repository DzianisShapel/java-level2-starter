package com.dmdev.oop.lesson11.practice;

import com.dmdev.oop.lesson11.Computer;
import com.dmdev.oop.lesson11.Ram;
import com.dmdev.oop.lesson11.Ssd;

public class Laptop  extends Computer {

    private int weight;

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;

    }

    public void open(){
        System.out.println("open me");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
