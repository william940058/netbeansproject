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
abstract class Activity {
    private String ActivityType;

    public Activity() {
    }
    
    public Activity(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }
    
    public String getActivityType() {
        return ActivityType;
    }

    @Override
    public String toString() {
        return " ActivityType=" + ActivityType + " ,";
    }
    
    
    
    
}
