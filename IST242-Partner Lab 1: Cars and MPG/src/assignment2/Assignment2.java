/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class Assignment2 {

/**
 * @param args the command line arguments
 */
    public static void main(String[] args) {
    // TODO code application logic here
    Car c1 = new Car("Lexus", 0.0, 0.0);
    Car c2 = new Car();
    c2.setBrand("BMW");
    c2.setOdometerReading(3048204.239482394);
    c2.setTotalFuelConsumed(934802.234);
    System.out.println("First " + c1.getInfo());
    System.out.println("Second " + c2.getInfo());
    System.out.println("Average MPG of Car 1 is " + c1.getMilesPerGallon()+".");
    System.out.println("Average MPG of Car 2 is " + c2.getMilesPerGallon()+".");
    System.out.println("");
    
    ArrayList<String> car = new ArrayList(500);
    Car c3 = new Car("Porsche", 0.0, 0.0);
    Car c4 = new Car("Toyota", -10.0, -10.0);
    Car c5 = new Car("Jaguar", 0.0, 0.0);
    System.out.println("Third " + c3.getInfo());
    System.out.println("Fourth " + c4.getInfo());
    System.out.println("Fifth " + c5.getInfo());
    System.out.println("Average MPG of Car 3 is " + c3.getMilesPerGallon()+".");
    System.out.println("Average MPG of Car 4 is " + c4.getMilesPerGallon()+".");
    System.out.println("Average MPG of Car 5 is " + c5.getMilesPerGallon()+".");
    }
}
