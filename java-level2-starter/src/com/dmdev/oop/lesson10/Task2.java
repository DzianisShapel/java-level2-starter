package com.dmdev.oop.lesson10;


/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */

public class Task2 {
    public static void main(String[] args) {

        String value = "123 some words and words 123";
        String word = "123";
        System.out.println(isStartAndFinished(value, word));
    }

    public static boolean isStartAndFinished(String target, String word){
        return target.startsWith(word) && target.endsWith(word);
    }

}
