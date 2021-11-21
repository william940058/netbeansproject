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
public class Interaction{
    
    private Customer customers;
    private Food foods;
    private Ride rides;
    private Restroom restrooms;
    private String date;
    private int duration;

    public Interaction() {
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public void setFoods(Food foods) {
        this.foods = foods;
    }

    public void setRides(Ride rides) {
        this.rides = rides;
    }

    public void setRestrooms(Restroom restrooms) {
        this.restrooms = restrooms;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public Customer getCustomers() {
        return customers;
    }

    public Food getFoods() {
        return foods;
    }

    public Ride getRides() {
        return rides;
    }

    public Restroom getRestrooms() {
        return restrooms;
    }

    @Override
    public String toString() {
        return "Date=" + date + ", Duration=" + duration + " " + customers + " " + foods + ", " + rides + ", " + restrooms;
    }
    
    

    

    

    

    
    

    
   
}
