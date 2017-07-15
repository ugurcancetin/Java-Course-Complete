package com.ugurcan;

public class Main {

    public static void main(String[] args) {
    	
/*    	Player player = new Player();
    	player.fullName = "Burak";
    	player.health = 20;
    	player.weapon = "Sword";

    	int damage = 10;
    	player.loseHealth(damage);
    	System.out.println("Remaining health =  " + player.healthRemaining());

    	damage = 11;
    	player.health = 200;
    	player.loseHealth(damage);
    	System.out.println("Remaining health =  " + player.healthRemaining());*/

    	Dimensions dimensions = new Dimensions(20, 20, 5);
    	Case theCase = new Case("2208", "Dell", "240", dimensions);

    	Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        System.out.println("Player Name " + player.getName());
        player.setHitPoints(150);
        System.out.println(player.getHitPoints());
    }
}
