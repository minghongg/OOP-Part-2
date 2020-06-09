package com.minghong;

public class EnhacedPlayer {
    //to rename the field, refactor -> rename
    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnhacedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health<=100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if(this.hitPoints <=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}