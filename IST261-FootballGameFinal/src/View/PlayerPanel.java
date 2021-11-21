package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class PlayerPanel extends JPanel
{
    private ArrayList<ArrayList<JLabel>> labels;
    private ArrayList<String> fpString;
    private ArrayList<ArrayList<String>> lines;
    int begin = 0;
    int option = 1;
        
    public PlayerPanel()
    {
        super();
        setBackground(Color.GRAY);
        
        labels = new ArrayList<>();
    }
    public void DisplayLabels (ArrayList<ArrayList<String>> lines)
    {
        removeAll();
                labels = new ArrayList<>();

        for(int i = 0; i < lines.size(); i++)//goes through lines of player info
        {
            labels.add(new ArrayList<>());
            for(int j = 0; j < 5; j++)//goes through each section on info (5 pieces of info ) 
            {
                labels.get(i).add(new JLabel(lines.get(i).get(j)));
                add(labels.get(i).get(j));
            }
    
        }
        setLayout(new GridLayout(lines.size(), 5));
        validate();
        repaint();
    }
}