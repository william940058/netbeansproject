package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class HeaderPanel extends JPanel
{
    private final ArrayList<JButton> buttons;
    
    public HeaderPanel()
    {
        super();
        setBackground(Color.black);
        
        buttons = new ArrayList<>();
        for(int i = 0; i < 5; i++) 
        {
            JButton jb = new JButton(" ");
            buttons.add(jb);
            add(jb); 
            jb.setBackground(Color.LIGHT_GRAY);
            jb.setOpaque(true);//needed these lines in order for setBackground to work
            jb.setBorderPainted(false);//needed these lines in order for setBackground to work
            
        }
        GridLayout gr = new GridLayout(1, buttons.size(), 1, 1); 
        setLayout(gr);
    }

    public void DisplayButtons (ArrayList<String>columnNames)
    {
        for(int i = 0; i < columnNames.size(); i++)
        {
            buttons.get(i).setText(columnNames.get(i));
        }
    } 
}