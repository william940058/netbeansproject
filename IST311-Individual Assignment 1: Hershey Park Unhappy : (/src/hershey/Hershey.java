/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hershey;


import java.util.ArrayList;


/**
 *
 * @author macbookpro
 */
public class Hershey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParkSimulation ps = new ParkSimulation();
        ps.addCustomer();
        ps.addRide();
        ps.addFood();
        ps.addRestroom();
        ArrayList<Interaction> arr = ps.recordCompletedHershey();
        ps.performSelectionSort(arr);
        ps.Result();
        ps.SaveData();
    }
  
}

