package com.ugurcan;

import com.ugurcan.Gearbox.*;

public class Main {

    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        
        Gearbox test = new Gearbox(5);
        System.out.println(test.new Gear(1, 9.0).driveSpeed(20));
        
        //Not reachable these ways
        //Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
        //Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
        //Gear test = new Gear(2, 10.0);
        
        System.out.println(first.driveSpeed(10));

        
        
    }
}
