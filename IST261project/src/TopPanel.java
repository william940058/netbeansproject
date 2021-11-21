
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
class TopPanel extends JPanel
{
   private JSlider speed = new JSlider (JSlider.HORIZONTAL, 5,40,20);
   private JLabel score;
    TopPanel()
    {
        super();
        setBackground(Color.ORANGE); 
        add(speed);
        TitledBorder title;
        title = BorderFactory.createTitledBorder("speed");
        title.setTitlePosition(TitledBorder.BELOW_BOTTOM);
        title.setTitleJustification(TitledBorder.TOP);
        speed.setPaintLabels(true);
        Hashtable table = new Hashtable();
        table.put(40, new JLabel("fast"));
        table.put(20, new JLabel("medium"));
        table.put(5, new JLabel("slow"));
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

}
