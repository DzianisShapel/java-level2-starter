package com.dmdev.oop.lesson10;

import java.sql.SQLOutput;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 *
 */


public class HW1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {

        String value = "abc Cpddd Dio OsfWw";
        String formattedString = format(value);
        System.out.println(formattedString);
    }

    public static String format(String value){
        String withoutSpaceValue = value.replace(SPACE,EMPTY).toUpperCase();
        StringBuilder sb = new StringBuilder();
        withoutSpaceValue.chars().distinct().forEach(c -> sb.append((char) c));
        return sb.toString();
    }

}
