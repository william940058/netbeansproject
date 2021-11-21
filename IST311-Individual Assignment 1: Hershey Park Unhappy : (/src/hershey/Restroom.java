/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hershey;

/**
 *
 * @author macbookpro
 */
public class Restroom extends Activity{
    private int restroomId;
    private int restroomPrice;

    public Restroom(int restroomId, int restroomPrice, String ActivityType) {
        super(ActivityType);
        this.restroomId = restroomId;
        this.restroomPrice = restroomPrice;
    }

    public Restroom() {
    }
    
    public void setRestroomId(int restroomId) {
        this.restroomId = restroomId;
    }

    public void setRestroomPrice(int restroomPrice) {
        this.restroomPrice = restroomPrice;
    }
    
    
    public int getRestRoomId() {
        return restroomId;
    }

    public int getRestRoomPrice() {
        return restroomPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "RestroomId=" + restroomId + ", RestroomPrice=" + restroomPrice + "$";
    }
    
}
