/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;

/**
 *
 * @author macbookpro
 */
public class Race{
    private int raceID;
    private String raceLocation;
    private int raceDate;
    

    public Race(int raceID, String raceLocation, int raceDate) {
        this.raceID = raceID;
        this.raceLocation = raceLocation;
        this.raceDate = raceDate;
    }
    
    public int getRaceID() {
        return raceID;
    }

    public String getRaceLocation() {
        return raceLocation;
    }

    public int getRaceDate() {
        return raceDate;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    public void setRaceLocation(String raceLocation) {
        this.raceLocation = raceLocation;
    }

    public void setRaceDate(int raceDate) {
        this.raceDate = raceDate;
    }
      
    @Override
    public String toString() {
        return "RaceID: " + raceID + ", Race location: " + raceLocation + ", Race date: " + raceDate;
    }

}
