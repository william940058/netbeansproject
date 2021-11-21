package View;

import javax.swing.*;

public class InitialFrame extends JFrame
{
    private InitialPanel ip;

    public InitialFrame()
    {
        super("IST 261 - Football Player Game");
        LayoutSetupMAC();
        ip = new InitialPanel();
        this.getContentPane().add(ip);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
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

    void LayoutSetupMAC()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }
}