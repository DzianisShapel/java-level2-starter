package com.dmdev.oop.lesson11;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";

    default void printWithRandom(){
        Random random = new Random();
        System.out.println(random.nextInt());
        print();
    }

    void print();
}
