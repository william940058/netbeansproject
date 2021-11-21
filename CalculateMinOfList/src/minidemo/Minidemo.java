/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minidemo;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class Minidemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double>list = new ArrayList();
        list.add(5.0);
        list.add(3.0);
        list.add(7.0);
        double minimum = calculateMinimum(list);
        System.out.println("The minimum of the values 5.0, 3.0, and 7.0 is " + minimum + ".");
        
    }
    public static double calculateMinimum(ArrayList<Double>list) {
        double minimum = list.get(0);
        for (Double array : list) {
            if (array < minimum){
                minimum = array;
            }
        }
        return minimum;
    }
    
}
