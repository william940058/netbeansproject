package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class NorthPanel extends JPanel
{
    private JSlider speed;
    private final JLabel score;
    int option = 1;

    public NorthPanel()
    {
        super();
        this.speed = new JSlider (JSlider.HORIZONTAL, 3,8,6);
        setBackground(Color.white); 
        add(speed);
        TitledBorder title;
        title = BorderFactory.createTitledBorder("speed");
        title.setTitlePosition(TitledBorder.BELOW_BOTTOM);
        title.setTitleJustification(TitledBorder.TOP);
        speed.setPaintLabels(true);
        Hashtable table = new Hashtable();
        table.put(8, new JLabel("fast"));
        table.put(6, new JLabel("medium"));
        table.put(3, new JLabel("slow"));
        speed.setLabelTable(table);
        speed.setFocusable(false);
        score = new JLabel("Win: 0, Loss: 0");
        add(score);
}
    
    public int getSpeed(){
       return this.speed.getValue();
    } 
    public void setSpeed(JSlider spd)
    {
        this.speed = spd;
    }
     public JLabel getScore(){
      return this.score;
      
    }
      @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //requestFocusInWindow();
        g.drawString("Main Map", 400, 300); 
        ImageIcon sourceImage1 = new ImageIcon("picture/psuheader.jpg");
        Image myImage1 = sourceImage1.getImage();
        if (option == 1)
        {
            g.drawImage(myImage1, 0, 0, this);
        }
}
} 