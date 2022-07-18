package com.dmdev.oop.lesson15;

public class Archer extends Hero {

    private Wolf wolf;


    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shoot a bow in " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    private class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy){
            System.out.println(name + " and " + Archer.this.getName() + " deal damage together");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }

}
