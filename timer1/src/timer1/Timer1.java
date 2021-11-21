/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer1;

import javax.swing.JFrame;

/**
 *
 * @author macbookpro
 */
public class Timer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimerT gui = new TimerT();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setTitle("Timer Program");
        gui.setVisible(true);
        
    }
    
}
