
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
class BotPanel extends JPanel
        
{
    private JButton rb = new JButton ("RB");
    private JButton lb = new JButton ("LB");
     
    private TopPanel tp;
    int delay;
    int speed;
    
    BotPanel(TopPanel top) {
        super();
        setLayout(null);
        this.tp = top;
        setBackground(Color.GREEN);
        add (rb);
        add (lb);
     
        initialize();
        
        setFocusable(true);
    }
    
    public void initialize() {
        rb.setBounds(150,350, 50, 50);
        lb.setBounds(800, 150, 50, 50);
    }
 
    public JButton getRb()
    {
        return rb;
    }

    public void setRb(JButton rb)
    {
        this.rb = rb;
    }

    public JButton getLb()
    {
        return lb;
    }

    public void setLb(JButton lb)
    {
        this.lb = lb;
    }
}

