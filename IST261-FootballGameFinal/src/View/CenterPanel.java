package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public final class CenterPanel extends JPanel
{
   private JButton rb = new JButton ("RB");
    private JButton lb = new JButton ("LB");
      int option = 1;
     
    private final NorthPanel np;
    int delay;
    int speed;

    public CenterPanel(NorthPanel north)
    {
        super();
        setLayout(null);
        this.np = north;
        setBackground(Color.BLUE);
        add(rb);
        add(lb);
     
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
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
       // requestFocusInWindow();
        g.drawString("Main Map", 400, 300); 
        ImageIcon sourceImage1 = new ImageIcon("picture/Background.jpg");
        Image myImage1 = sourceImage1.getImage();
        if (option == 1)
        {
            g.drawImage(myImage1, 0, 40, this);
        }
}
}