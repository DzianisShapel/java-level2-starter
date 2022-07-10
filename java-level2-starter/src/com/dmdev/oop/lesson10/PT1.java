package com.dmdev.oop.lesson10;
/**
Проверить, является ли введённая строка палиндромом,
 т.е. читается одинаково в обоих направлениях
 */
public class PT1 {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String value = "а роза упала на лапу Азора";
        boolean result = isPalindrome(value);
        System.out.println(result);
    }

    public static boolean isPalindrome(String value){

        String withoutSpaceValue = value.replace(SPACE, EMPTY);
        return new StringBuilder(withoutSpaceValue).reverse().toString().equalsIgnoreCase(withoutSpaceValue);

    }
}
