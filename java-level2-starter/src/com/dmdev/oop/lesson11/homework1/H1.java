package com.dmdev.oop.lesson11.homework1;

import java.util.Scanner;

public class H1 {

        private static ATM atm;

        public static void main(String[] args){
            atm = new ATM(3);// в банкомат запускаем коликчество номиналов купюр
            run();
        }

        private static void run() {
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Choose an action: 1 - Bring money, 2 - Withdraw, 0 - Exit");
                try{
                    int code = Integer.parseInt(sc.nextLine());
                    if(code == 0){
                        break;
                    }else if(code == 1){
                        atm.setBablo();
                    }else if(code == 2){
                        atm.getBablo();
                    }else{
                        System.err.println("Unknown operation");
                    }
                }catch(NumberFormatException e){
                    System.err.println("Stupid User2!!!");
                }
            }
            sc.close();
        }
}
