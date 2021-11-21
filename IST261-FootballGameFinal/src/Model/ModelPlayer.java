package Model;

import java.awt.Rectangle;

public class ModelPlayer
{

    private int x;
    private int y;
    private int w;
    private int h;
    private int speed;

   ModelPlayer()
    {

    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getW()
    {
        return w;
    }

    public void setW(int w)
    {
        this.w = w;
    }

    public int getH()
    {
        return h;
    }

    public void setH(int h)
    {
        this.h = h;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x, y, w, h);
    }

}

