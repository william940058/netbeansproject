package Model;

public class Model
{

    private FootballPlayerData FPData;
    public int begin = 0;
    private ModelRB rb = new ModelRB();
    private ModelLB lb = new ModelLB();

   public Model()
    {
        FPData = new FootballPlayerData();
    }

    /**
     * @return the FPData
     */
    public FootballPlayerData getFPData()
    {
        return FPData;
    }

    /**
     * @param FPData the FPData to set
     */
    public void setFPData(FootballPlayerData FPData)
    {
        this.FPData = FPData;
    }
    
    public int start()
    {
        int start[] = new int[0];
        return start.length;
    }
    
    public int end()
    {
        int end[] = new int[6];
        return end.length;
    }
   public ModelRB getRb()
    {
        return rb;
    }

    public void setRb(ModelRB rb)
    {
        this.rb = rb;
    }

    public ModelLB getLb()
    {
        return lb;
    }

    public void setLb(ModelLB lb)
    {
        this.lb = lb;
    }
}