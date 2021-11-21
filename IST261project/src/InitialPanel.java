
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class InitialPanel extends JPanel
{
    TopPanel top;
    BotPanel bot;
    public InitialPanel(){
       super();
            setBackground(Color.GRAY);
            BorderLayout bl = new BorderLayout();
            setLayout(bl);
           
             
        top = new TopPanel();
        bot = new BotPanel(top); 
        
        add(bot, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);
    }
     public TopPanel getTopPanel()
    {
        return top;
    }

    public void setTopPanel(TopPanel tp)
    {
        this.top = tp;
    }

    public BotPanel getBotPanel()
    {
        return bot;
    }

    public void setBotPanel(BotPanel bp)
    {
        this.bot = bp;
    }
    
    
}
