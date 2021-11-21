package Model;

import java.awt.Rectangle;

public class ModelLB extends ModelPlayer
{

    private int x0;
    private int y0;
    private int speed;
    private int width;
    private int height;
    public String move;

    public ModelLB()
    {
        super();
    }

    public int getX0()
    {
        return x0;
    }

    public void setX0(int x0)
    {
        this.x0 = x0;
    }

    public int getY0()
    {
        return y0;
    }

    public void setY0(int y0)
    {
        this.y0 = y0;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void move(Rectangle r1)
    {

        int x0 = (int) r1.getX();
        int y0 = (int) r1.getY();
        if (x0 < getX() - 75)
        {
            x0 += speed;
        }
        if (x0 > getX() + 75)
        {
            x0 -= speed;
        }
        if (y0 > getY() + 75)
        {
            y0 -= speed;
        }
        if (y0 < getY() - 75)
        {
            y0 += speed;
        }

    }
}
