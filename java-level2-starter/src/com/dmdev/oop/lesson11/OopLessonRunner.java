package com.dmdev.oop.lesson11;



public class OopLessonRunner {

        public static void main(String[] args) {
            Computer laptop = new Laptop(new Ram(1024), new Ssd(250), 2);
            Computer mobile = new Mobile(new Ram(512), new Ssd(125));

            loadComputers(laptop, mobile);
            printInformation(new Computer[]{laptop, mobile});
        }

        public static void printInformation(Computer[] computers) {
            for (Computer computer : computers) {
                computer.print();
                System.out.println();
            }
        }

        public static void loadComputers(Computer... computers) {
            for (Computer computer : computers) {
                computer.load();
                System.out.println();
            }
        }

}
