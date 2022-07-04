package com.dmdev.oop.homework1;

public class Room {
    boolean IsPassage;

    public Room(boolean IsPassage){
        this.IsPassage = IsPassage;
    }

    public boolean getValue(){
        return IsPassage;
    }

    public void setValue(boolean IsPassage){
        this.IsPassage = IsPassage;
    }

    public void print(){
        System.out.println("Room is passage: " + IsPassage);
    }

}
