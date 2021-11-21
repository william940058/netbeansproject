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
public class CircularSilo extends Building {
    private double radius;
    private double height;

    public CircularSilo(double radius, double height, int purchaseCost, String buildingColor, String ownerName, Address address) {
        super(purchaseCost, buildingColor, ownerName, address);
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo()+ "  Radius:" + radius +
                "  Height:" + height;
    }
    @Override
    public double calculateVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
}
