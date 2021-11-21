/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingproject;

/**
 *
 * @author macbookpro
 */
public class Address {
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zip;
    
    public Address(int streetNumber, String streetName, String city, String state, int zip) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getInfo() {
        return "  Street number:" + this.streetNumber +
                "  Street name:" + this.streetName +
                "  City:" + this.city +
                "  State:" + this.state +
                "  Zip:" + this.zip;
    }
            
}
