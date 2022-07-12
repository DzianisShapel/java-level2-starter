package com.dmdev.oop.lesson11.homework1;

/*
* Создать класс, описывающий банкомат.
Банкомат задается тремя свойствами:
- количеством купюр номиналом 20, 50 и 100.
Сделать методы для добавления денег в банкомат.
Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
* */

public class ATM {
    private int amountNominal20;
    private int amountNominal50;
    private int amountNominal100;

    public ATM(int amountNominal20, int amountNominal50, int amountNominal100) {
        this.amountNominal20 = amountNominal20;
        this.amountNominal50 = amountNominal50;
        this.amountNominal100 = amountNominal100;
    }

    public int getAmountNominal20() {
        return amountNominal20;
    }

    public void setAmountNominal20(int amountNominal20) {
        this.amountNominal20 = amountNominal20;
    }

    public int getAmountNominal50() {
        return amountNominal50;
    }

    public void setAmountNominal50(int amountNominal50) {
        this.amountNominal50 = amountNominal50;
    }

    public int getAmountNominal100() {
        return amountNominal100;
    }

    public void setAmountNominal100(int amountNominal100) {
        this.amountNominal100 = amountNominal100;
    }

    public boolean withdrawal(int sum){
        int balance = getAmountNominal20()*20 + getAmountNominal50()*50 + getAmountNominal100()*100;
        int balanceAfterWithdrawal;
        if(balance >= sum){
            balanceAfterWithdrawal = balance - sum;
            balance = balanceAfterWithdrawal;

        /*    int amount20 = getAmountNominal20();
            int amount50 = getAmountNominal50();
            int amount100 = getAmountNominal100();*/

            int billAmount100 = sum / amountNominal100;
            int ostatokAfter100 = sum % amountNominal100;
            int billAmountAfter50 = ostatokAfter100 / amountNominal50;
            int billAmountAfter20 = billAmountAfter50 / amountNominal20;


            if(ostatokAfter100 == 0){
                System.out.println("Withdrawal will be executed with bill's nominal 100, count: " + billAmount100);
            } else if ((ostatokAfter100 % amountNominal50) == 0 ){
                System.out.println("Withdrawal will be executed with bill's nominal 50, count: " + billAmountAfter50);
            } else {
                System.out.println("Withdrawal will be executed with bill's nominal 20, count: " + billAmountAfter20);
            }
            return true;
        }  else {
            return false;
        }
    }
}
