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
public class RectangularRanch extends Building {
    private double length;
    private double width;
    private double height;

    public RectangularRanch(double length, double width, double height, int purchaseCost, String buildingColor, String ownerName, Address address) {
        super(purchaseCost, buildingColor, ownerName, address);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+ "  Length:" + length +
                "  Width:" + width +
                "  Height:" + height;
    }
    @Override
    public double calculateVolume() {
        double volume = length * width * height;
        return volume;
    }
    
}
