package com.dmdev.oop.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
      int value = 5;

/*  Создаем переменную computer у которой тип - это созданный нами класс Computer
*   Инициализируем, используем ключевое слово new, так как у нас уже не
*   примитивный тип данных
* */
      Computer computer = new Computer();
    /*и можем образаться ко всему, что есть в классе Computer
      computer.load();
      System.out.println("Ram: " + computer.ram);
      System.out.println("Ssd: " + computer.ssd);*/
        computer.printState();

      Computer computer2 =  new Computer(1050);
      computer2.printState();

      Computer computer3 =  new Computer(10000, 10000);
      computer3.printState();
    }
}
