
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
public class InitialFrame extends JFrame
{
    private InitialPanel ip;
     InitialFrame()
    {
        super("IST 242 - Model, View, Controller ");
        ip = new InitialPanel();
        add(ip);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 580);
        setVisible(true);
        
    }

    public InitialPanel getInitialPanel()
    {
        return ip;
    }

    public void setInitialPanel(InitialPanel cp)
    {
        this.ip = cp;
    }
    
}
