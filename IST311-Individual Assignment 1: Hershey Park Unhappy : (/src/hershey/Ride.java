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
public class Ride extends Activity{
    private int rideId;
    private String rideName;
    private int rideTime;
    
    public Ride() {
    }
    
    public Ride(int rideId, String rideName, int rideTime, String ActivityType) {
        super(ActivityType);
        this.rideId = rideId;
        this.rideName = rideName;
        this.rideTime = rideTime;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public void setRideTime(int rideTime) {
        this.rideTime = rideTime;
    }
    
    
    
    public int getRideId() {
        return rideId;
    }

    public String getRideName() {
        return rideName;
    }

    public int getRideTime() {
        return rideTime;
    }

    @Override
    public String toString() {
        return super.toString() + "RideId=" + rideId + ", RideName=" + rideName + ", RideTime=" + rideTime;
    }

    
}
