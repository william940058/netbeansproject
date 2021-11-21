/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author macbookpro
 */
public class TimerT extends JFrame{
    JLabel promptLabel, timerLabel;
    int counter;
    JTextField tf;
    JButton button;
    Timer timer;
    
    public TimerT(){
        setLayout(new GridLayout(2, 3, 5, 5));
        
        promptLabel = new JLabel("Enter seconds:", SwingConstants.CENTER);
        add(promptLabel);
        
        tf = new JTextField(5);
        add(tf);
        
        button = new JButton("Start timing");
        add(button);
        
        timerLabel = new JLabel("Waiting...", SwingConstants.CENTER);
        add(timerLabel);
        
        event e = new event();
        button.addActionListener(e);
        
    }
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int count = (int)(Double.parseDouble(tf.getText()));
            timerLabel.setText("Time left: " + count);
            
            TimeClass tc = new TimeClass(count);
            timer = new Timer(1000, tc);
            timer.start();
        }
    }
    public class TimeClass implements ActionListener {
        int counter;

        public TimeClass(int counter) {
            this.counter = counter;
        }

        public void actionPerformed(ActionEvent tc) {
            counter--;
            
            if(counter >= 1){
                timerLabel.setText("Timer left: " + counter);
                
            }else {
                timer.stop();
                timerLabel.setText("Done!");
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
