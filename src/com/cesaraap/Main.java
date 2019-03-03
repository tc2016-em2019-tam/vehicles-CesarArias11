package com.cesaraap;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep", 4);
        myArray[1] = new Jeep("Frank's Jeep",4);
        myArray[2] = new Hovercraft("Sue's Hover-craft",8,0.0);
        myArray[3] = new Frigate("Money Waster",0.0);
        myArray[4] = new PoliceCar("Patrol 777",5,200.20,4);

        LinkedList<Vehicle> myVehicles = new LinkedList<Vehicle>();
        myVehicles.add(new Jeep("Fred's Jeep", 4));
        myVehicles.add(new Jeep("Frank's Jeep", 4));
        myVehicles.add(new Hovercraft("Sue's Hover-craft", 8,0.0));
        myVehicles.add(new Frigate("Money Waster", 0.0));
        myVehicles.add(new PoliceCar("Patrol 777", 5, 200.20, 4));


        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {  // solo se ejecuta si es landvehicle y llama un metodo
                LandVehicle lv = (LandVehicle)myArray[i];
                lv.drive();
            }

            if (myArray[i] instanceof Emergency) {  // solo se ejecuta si es landvehicle y llama un metodo
                Emergency sv = (Emergency) myArray[i];
                sv.soundSiren();
            }
        }
    }
}
