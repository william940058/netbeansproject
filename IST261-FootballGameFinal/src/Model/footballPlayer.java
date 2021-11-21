package Model;

import java.util.ArrayList;

public class footballPlayer
{

    private int number;
    private String name;
    private String position;
    private heightClass height;
    private int weight;

    public footballPlayer(int nu, String na, String po, int hf, int hi, int wt)
    {
        number = nu;
        name = na;
        position = po;
        height = new heightClass(hf, hi);
        weight = wt;
    }

    public ArrayList<String> fpString()
    {
        ArrayList<String> sFP = new ArrayList<>();
        sFP.add(getNumberString());
        sFP.add(name);
        sFP.add(position);
        sFP.add(height.toString());
        sFP.add(getWeightString());
        return sFP;
    }

    public int getNumber()
    {
        return number;
    }

    public String getNumberString()
    {
        return Integer.toString(number);
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public heightClass getHeight()
    {
        return height;
    }

    public void setHeight(heightClass height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getWeightString()
    {
        return Integer.toString(weight);
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

}