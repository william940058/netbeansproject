package View;

import Model.footballPlayer;
import java.awt.Color;
import javax.swing.*;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class WestPanel extends JPanel
{
    private final ArrayList<footballPlayer> FPList;
    private final HeaderPanel hp;
    private final PlayerPanel pp;
    private final SelectionPanel sp;
    

    public WestPanel()
    {
             super();
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        setBackground(Color.white);
        FPList = new ArrayList<>();
        hp = new HeaderPanel();
        add(hp, BorderLayout.NORTH);
        pp = new PlayerPanel();
        add(pp, BorderLayout.CENTER);
        sp = new SelectionPanel();
        add(sp, BorderLayout.SOUTH);
        
    }

    /**
     * @return the hp
     */
    public HeaderPanel getHp() 
    {
        return hp;
    }
    /**
     * @return the pp
     */
    public PlayerPanel getPp() {
        return pp;
    }  
    /**
     * @return the sp
     */
    public SelectionPanel getSp() {
        return sp;
    }
  
}