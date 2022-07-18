package com.dmdev.oop.lesson11.homework1;

public class Bablo {
    private int nominal;
    private int n;

    public Bablo(int nom, int n) {
        nominal = nom;
        this.n = n;
    }

    void addBablo(int n) {
        this.n += n;
    }

    boolean isMoney() {
        return n > 0;
    }

    int getNominal() {
        return nominal;
    }

    boolean babloVNorme(int request) {
        return request <= n;
    }

    void getMoney(int n) {
        this.n -= n;
        System.out.println(nominal + "грн. = " + n);
    }
}



