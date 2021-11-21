/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
 class Util
{
     // From Yan
     private int minSpeed = 5;
     private int maxSpeed = 15;
     private int timerDelay = 50;
     private int frameWidth = 1000;
     private int frameHeight = 800;
     public Util() {}

    public int getMinSpeed()
    {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed)
    {
        this.minSpeed = minSpeed;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getTimerDelay()
    {
        return timerDelay;
    }

    public void setTimerDelay(int timerDelay)
    {
        this.timerDelay = timerDelay;
    }

    public int getFrameWidth()
    {
        return frameWidth;
    }

    public void setFrameWidth(int frameWidth)
    {
        this.frameWidth = frameWidth;
    }

    public int getFrameHeight()
    {
        return frameHeight;
    }

    public void setFrameHeight(int frameHeight)
    {
        this.frameHeight = frameHeight;
    }
     
}
