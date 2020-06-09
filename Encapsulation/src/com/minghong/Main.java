package com.minghong;

public class Main {

    public static void main(String[] args) {
//    	//bad example
//	    Player player = new Player();
//	    //we can acess player's fields directly because we set the scope of the field as public.
//	    player.name = "Ming Hong";
//	    player.health = 100;
//	    player.weapon = "Knife";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//      System.out.println("Remaining health : " + player.remainingHealth());
		
        //good example
        //if validation failed, the health will return the default value
        EnhacedPlayer player = new EnhacedPlayer("Ming", 200, "Sword");
        System.out.println("Health = " + player.getHealth());
    }
}
