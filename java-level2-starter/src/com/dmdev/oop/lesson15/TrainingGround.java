package com.dmdev.oop.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
      Hero warrior =  new Warrior("Boromir", 15);
      Hero mage =  new Mage("Gandalf", 20);
      Hero archer =  new Archer("Legalaz", 10);

      Enemy enemy = new Enemy("Zombi", 100);

      attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heros){

        while(enemy.isAlive()){
            for (Hero hero: heros) {
                if(enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
