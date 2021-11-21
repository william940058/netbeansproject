package Model;

import java.awt.Rectangle;

public class ModelRB extends ModelPlayer
{

    public String direction;
    public String move;
   

    public ModelRB()
    {
        super();
    }

    public void move (String direction, Rectangle r0) {
        if (direction.equals("UP")) setY(getY() - 10);
        if (direction.equals("DOWN")) setY(getY() + 10);
        if (direction.equals("LEFT")) setX(getX() - 10);
        if (direction.equals("RIGHT")) setX(getX() + 10);
        if (getX() < 0) setX(0);
        if (getY() < 0) setY(0);
        int w0 = (int)r0.getWidth();
        int h0 = (int)r0.getHeight();
        if (getX() + getW() > w0) setX(w0);
        if (getY() + getH() > h0) setY(h0);
        
    }  

}
