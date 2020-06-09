package com.minghong;

public class Player {
    //class that does not implement encapsulation
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
        }
    }
    public int remainingHealth(){
        return this.health;
    }
}
