package com.dmdev.oop.lesson11.homework1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
* Создать класс, описывающий банкомат.
Банкомат задается тремя свойствами:
- количеством купюр номиналом 20, 50 и 100.
Сделать методы для добавления денег в банкомат.
Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
* */

//не работает

public class ATM {
    private Bablo[] b;
    private final int[] nam = new int[]{20, 50, 100, 200, 500, 1000};

        public ATM(int n) {
            b = new Bablo[nam.length];
            Random r = new Random();//для автозаполнения банкомата баблом
            for(int i = 0; i < n; i++){
                b[i] = new Bablo(nam[i], r.nextInt(100) + 1);//заполняем банкомат баблом
            }
        }

        void setBablo() {
            System.out.println("AHTUNG!!!");
            Scanner sca = new Scanner(System.in);
            for(int i = 0; i < nam.length; i++){
                System.out.println("Enter amount of bills " + nam[i] + " dollars.");
                int n = Integer.parseInt(sca.nextLine());
                if(b[i] != null){
                    b[i].addBablo(n);
                }
                else{
                    b[i] = new Bablo(nam[i], n);
                }
            }
            sca.close();
        }

        void getBablo() {
            System.out.print("AHTUNG!");
            printNam();
            System.out.println("\nEnter amount");
            Scanner scan = new Scanner(System.in);
            int suma = Integer.parseInt(scan.nextLine());
            scan.close();
            System.out.println(colc(suma) ? "\n\n" : "operation is impossible\n\n");
        }

        private void printNam() {
            for(int i = 0; i < b.length; i++){
                if(b[i] != null && b[i].isMoney()){
                    System.out.print(b[i].getNominal() + ", ");
                }
            }
        }

        private boolean colc(int suma) {
            ArrayList<Loc> l = new ArrayList<Loc>();
            if(suma % 10 != 0){
                return false;
            }
            else{
                for(int i = b.length - 1; i >= 0; i++){
                    if(b[i] != null){
                        //провепяеи хватит ли денег в банкомате
                        int request = suma % b[i].getNominal();
                        if(b[i].babloVNorme(request)){//бабла хватае
                            l.add(new Loc(i, request));
                            suma -= request * b[i].getNominal();
                        }
                        if(suma == 0){
                            break;
                        }
                    }
                }
                if(suma != 0){
                    return false;
                }else{
                    //Выдаем баблишко
                    System.out.println("You receive bills:");
                    for(int i = 0; i < l.size(); i++){
                        b[l.get(i).position].getMoney(l.get(i).n);
                    }
                    return true;
                }
            }
        }

}

