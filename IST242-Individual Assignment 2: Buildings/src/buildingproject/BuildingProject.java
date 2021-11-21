/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingproject;

/**
 *
 * @author macbookpro
 */
public class BuildingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address a1 = new Address(140, "Levashire", "State College", "PA", 16803);
        CircularSilo c1 = new CircularSilo(3.5, 5, 999, "yellow", "Peter", a1);
        RectangularRanch r1 = new RectangularRanch(2, 3, 4, 234, "green", "edmond", a1);
        
        System.out.println(c1.getInfo());
        System.out.println("Volume: " + c1.calculateVolume());
        System.out.println(r1.getInfo());
        System.out.println("Volume: " + r1.calculateVolume());
    }
}
