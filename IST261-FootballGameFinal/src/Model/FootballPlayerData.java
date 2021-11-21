package Model;

import java.util.*;

public final class FootballPlayerData
{

    private ArrayList<String> columnNames;
    private ArrayList<footballPlayer> FPList;
    private final ArrayList<String> radioButtonNames;

    public FootballPlayerData()
    {
        columnNames = new ArrayList<>();
        FPList = new ArrayList<>();
        createColumns();
        createPlayers();
        radioButtonNames = new ArrayList<>();
        createRadioButtons();
    }

    void createColumns()
    {
        columnNames.add("Number");
        columnNames.add("Name");
        columnNames.add("Position");
        columnNames.add("Height");
        columnNames.add("Weight");

    }
    void createRadioButtons()
    {
        radioButtonNames.add("(2)");
        radioButtonNames.add("(37)");
        radioButtonNames.add("(28)");
        radioButtonNames.add("(35)");
        radioButtonNames.add("(26)");
        radioButtonNames.add("(91)");
    }

    void createPlayers()
    {
        getFPList().add(new footballPlayer(2, "Marcus Allen", "S", 6, 2, 209));
        getFPList().add(new footballPlayer(37, "Kyle Alston", "CB", 5, 9, 180));
        getFPList().add(new footballPlayer(28, "Troy Apke", "S", 6, 1, 198));
        getFPList().add(new footballPlayer(35, "Matthew Baney", "LB", 6, 0, 225));
        getFPList().add(new footballPlayer(26, "Saquon Barkley", "RB", 5, 11, 222));
        getFPList().add(new footballPlayer(91, "Tarow Barney", "DT", 6, 1, 306));
      
    }

    public ArrayList<footballPlayer> getFpList()
    {
        return getFPList();
    }

    public void setFpList(ArrayList<footballPlayer> fplist)
    {
        this.setFPList(fplist);
    }

    public ArrayList<String> getColumnNames()
    {
        return columnNames;
    }

    public void setColumnNames(ArrayList<String> columnNames)
    {
        this.columnNames = columnNames;
    }

    public ArrayList<String> getLine(int n)
    {
        return getFPList().get(n).fpString();
    }

    public ArrayList<ArrayList<String>> getLines(int begin, int end)
    {
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        for (int i = begin; i < end; i++)
        {
            lines.add(getFPList().get(i).fpString());
        }
        return lines;
    }

    /**
     * @return the FPList
     */
    public ArrayList<footballPlayer> getFPList()
    {
        return FPList;
    }

    /**
     * @param FPList the FPList to set
     */
    public void setFPList(ArrayList<footballPlayer> FPList)
    {
        this.FPList = FPList;
    }
    
    public ArrayList<String> getRadioButtonNames()
    {
        return radioButtonNames;
    }

}