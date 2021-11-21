package View;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class SelectionPanel extends JPanel
{
    private final ArrayList<JRadioButton> radioButtons;
    
    public SelectionPanel()
    {
        super();
        setBackground(Color.DARK_GRAY);
        radioButtons = new ArrayList<>();
        
        JLabel jl = new JLabel("Select a Player's Number");
        add(jl);
        jl.setBackground(Color.DARK_GRAY);
        jl.setForeground(Color.white);
        for(int i = 0; i < 6; i++)
        {
            JRadioButton rb = new JRadioButton(" ");
            radioButtons.add(rb);
            add(rb);
            rb.setBackground(Color.LIGHT_GRAY);
            rb.setForeground(Color.white);//text to white
            rb.setOpaque(true);//needed these lines in order for setBackground to work
            rb.setBorderPainted(false);//needed these lines in order for setBackground to work       
        }
             
    }
    public void DisplayRadioButtons (ArrayList<String>radioButtonNames)
    {
        for(int i = 0; i < radioButtonNames.size(); i++)
        {
            getRadioButtons().get(i).setText(radioButtonNames.get(i));
        }

    }
    public void radioButtonColor() //changes color of selected button 
    {
        if(radioButtons.get(0).isSelected())
        {
            radioButtons.get(0).setBackground(Color.black);
            radioButtons.get(0).setForeground(Color.white);
            radioButtons.get(1).setBackground(Color.LIGHT_GRAY);
            radioButtons.get(1).setForeground(Color.white);
            radioButtons.get(2).setBackground(Color.LIGHT_GRAY);
            radioButtons.get(2).setForeground(Color.white);
            radioButtons.get(3).setBackground(Color.LIGHT_GRAY);
            radioButtons.get(3).setForeground(Color.white);
            radioButtons.get(4).setBackground(Color.LIGHT_GRAY);
            radioButtons.get(4).setForeground(Color.white);
            radioButtons.get(5).setBackground(Color.LIGHT_GRAY);
            radioButtons.get(5).setForeground(Color.white);
            
        }
        if(radioButtons.get(1).isSelected())
        {
           radioButtons.get(1).setBackground(Color.black);
           radioButtons.get(1).setForeground(Color.white);
           radioButtons.get(0).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(0).setForeground(Color.white);
           radioButtons.get(2).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(2).setForeground(Color.white);
           radioButtons.get(3).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(3).setForeground(Color.white);
           radioButtons.get(4).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(4).setForeground(Color.white);
           radioButtons.get(5).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(5).setForeground(Color.white);
        }
        if(radioButtons.get(2).isSelected())
        {
           radioButtons.get(2).setBackground(Color.black);
           radioButtons.get(2).setForeground(Color.white);
           radioButtons.get(0).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(0).setForeground(Color.white);
           radioButtons.get(1).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(1).setForeground(Color.white);
           radioButtons.get(3).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(3).setForeground(Color.white);
           radioButtons.get(4).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(4).setForeground(Color.white);
           radioButtons.get(5).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(5).setForeground(Color.white);
        }
        if(radioButtons.get(3).isSelected())
        {
           radioButtons.get(3).setBackground(Color.black);
           radioButtons.get(3).setForeground(Color.white);
           radioButtons.get(0).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(0).setForeground(Color.white);
           radioButtons.get(1).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(1).setForeground(Color.white);
           radioButtons.get(2).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(2).setForeground(Color.white);
           radioButtons.get(4).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(4).setForeground(Color.white);
           radioButtons.get(5).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(5).setForeground(Color.white);
        }
        if(radioButtons.get(4).isSelected())
        {
           radioButtons.get(4).setBackground(Color.black);
           radioButtons.get(4).setForeground(Color.white);
           radioButtons.get(0).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(0).setForeground(Color.white);
           radioButtons.get(1).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(1).setForeground(Color.white);
           radioButtons.get(2).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(2).setForeground(Color.white);
           radioButtons.get(3).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(3).setForeground(Color.white);
           radioButtons.get(5).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(5).setForeground(Color.white);
        }
        if(radioButtons.get(5).isSelected())
        {
           radioButtons.get(5).setBackground(Color.black);
           radioButtons.get(5).setForeground(Color.white);
           radioButtons.get(0).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(0).setForeground(Color.white);
           radioButtons.get(1).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(1).setForeground(Color.white);
           radioButtons.get(2).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(2).setForeground(Color.white);
           radioButtons.get(3).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(3).setForeground(Color.white);
           radioButtons.get(4).setBackground(Color.LIGHT_GRAY);
           radioButtons.get(4).setForeground(Color.white);
        }
    }
    public void radioButtonSelection(int i) //makes radio buttons unselected when new button is selected
    {
        if(i == 0)
        {
            radioButtons.get(0).setSelected(true);
            radioButtons.get(1).setSelected(false);
            radioButtons.get(2).setSelected(false);
            radioButtons.get(3).setSelected(false);
            radioButtons.get(4).setSelected(false);
            radioButtons.get(5).setSelected(false);
            
        }
        if(i == 1)
        {
            radioButtons.get(1).setSelected(true);
            radioButtons.get(2).setSelected(false);
            radioButtons.get(0).setSelected(false);
            radioButtons.get(3).setSelected(false);
            radioButtons.get(4).setSelected(false);
            radioButtons.get(5).setSelected(false);
        }
        if(i == 2)
        {
            radioButtons.get(2).setSelected(true);
            radioButtons.get(0).setSelected(false);
            radioButtons.get(1).setSelected(false);
            radioButtons.get(3).setSelected(false);
            radioButtons.get(4).setSelected(false);
            radioButtons.get(5).setSelected(false);
        } 
        if(i == 3)
        {
            radioButtons.get(3).setSelected(true);
            radioButtons.get(0).setSelected(false);
            radioButtons.get(1).setSelected(false);
            radioButtons.get(2).setSelected(false);
            radioButtons.get(4).setSelected(false);
            radioButtons.get(5).setSelected(false);
        } 
        if(i == 4)
        {
            radioButtons.get(4).setSelected(true);
            radioButtons.get(0).setSelected(false);
            radioButtons.get(1).setSelected(false);
            radioButtons.get(2).setSelected(false);
            radioButtons.get(3).setSelected(false);
            radioButtons.get(5).setSelected(false);
        } 
        if(i == 5)
        {
            radioButtons.get(5).setSelected(true);
            radioButtons.get(0).setSelected(false);
            radioButtons.get(1).setSelected(false);
            radioButtons.get(2).setSelected(false);
            radioButtons.get(3).setSelected(false);
            radioButtons.get(4).setSelected(false);
        } 
    }
    
    /**
     * @return the radioButtons
     */
    public ArrayList<JRadioButton> getRadioButtons() {
        return radioButtons;
    }
    
}