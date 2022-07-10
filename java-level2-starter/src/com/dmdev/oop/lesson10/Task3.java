package com.dmdev.oop.lesson10;

public class Task3 {

    /**
     * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
     * отчество и возвращающую инициалы
     *     в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
     * регистре, а результирующая строка должна быть в верхнем.
     */

    public static void main(String[] args) {

        String result = format("Ivan", "Ivanov", "Ivanovich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName){
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
    }
}
