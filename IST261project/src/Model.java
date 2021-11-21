
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
public class Model
{
    private ModelScore score= new ModelScore();
    private Util util = new Util();
    private ModelRB rb = new ModelRB();
    private ModelLB lb = new ModelLB();
    
    public Model(){
    }
    public ModelScore getScore(){
        return this.score;
    }

    public Util getUtil()
    {
        return util;
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