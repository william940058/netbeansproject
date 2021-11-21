/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author macbookpro
 */
public class Car{       
    private String brand;
    private double odometerReading;
    private double totalFuelConsumed; 
    
    public Car(String brand, double odometerReading, double totalFuelConsumed){
        this.brand = brand;
        this.odometerReading = odometerReading;
        this.totalFuelConsumed = totalFuelConsumed; 
    }
    public Car(){
        this.brand = "";
        this.odometerReading = 0.0;
        this.totalFuelConsumed = 0.0;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setOdometerReading(double odometerReading) {
        this.odometerReading  = odometerReading;
    }
    public double getOdometerReading() {
        return this.odometerReading;
    }
    public void setTotalFuelConsumed(double totalFuelConsumed) {
        this.totalFuelConsumed = totalFuelConsumed;
    }
    public double getTotalFuelConsumed() {
        return this.totalFuelConsumed;
    }
    public String getInfo() {
        String info = "car brand is " + this.brand + ". Odometer reading is " + this.odometerReading + ". TotalFuelConsumed is " + this.totalFuelConsumed + "."; 
        return info;
    }
    public double getMilesPerGallon() {
        if(this.odometerReading == 0.0 && this.totalFuelConsumed == 0.0) {
            return 0;
        }
        if(this.odometerReading < 0.0 || this.totalFuelConsumed < 0.0) {
            return -1;
        }
        if(this.odometerReading > 0.0 && this.totalFuelConsumed == 0.0) {
            return -1;
        }
        else {
            return this.odometerReading/this.totalFuelConsumed;
        }
    }
}


