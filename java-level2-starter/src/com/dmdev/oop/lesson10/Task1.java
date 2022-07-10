package com.dmdev.oop.lesson10;

/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 */

public class Task1 {
    public static void main(String[] args) {

        String value = "words :( other words :( :(  and happy smiles :) :)  ";
        String result = replace(value);
        System.out.println(result);

    }

    /*main - static а из статического метода мы можем вызывать другие статические методы
    * либо методы относящиеся к объекту*/

    public static String replace(String value){
            return value.replace(":(", ":)");
    }

}
