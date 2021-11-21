package View;

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel
{

    private final NorthPanel np;
    private final WestPanel wp;
    private final CenterPanel cp;
    private final SelectionPanel sp;

    public InitialPanel()
    {
        super();
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        np = new NorthPanel();
        wp = new WestPanel();
        cp = new CenterPanel(np);
        sp = new SelectionPanel();
        add(np, BorderLayout.NORTH);
        add(wp, BorderLayout.WEST);
        add(cp, BorderLayout.CENTER);
    }

    /**
     * @return the np
     */
    public NorthPanel getNp() {
        return np;
    }
    
    /**
     * @return the wp
     */
    public WestPanel getWp() {
        return wp;
    }

    /**
     * @return the cp
     */
    public CenterPanel getCp() {
        return cp;
    }
    
    /**
     * @return the sp
     */
    public SelectionPanel getSp() {
        return sp;
    }

}