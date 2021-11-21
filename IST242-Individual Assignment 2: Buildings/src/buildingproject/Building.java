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
public abstract class Building {
    private int purchaseCost;
    private String buildingColor;
    private String ownerName;
    private Address address;
    
    
    public Building(int purchaseCost, String buildingColor, String ownerName, Address address) {
        
            this.purchaseCost = purchaseCost;
            this.buildingColor = buildingColor;
            this.ownerName = ownerName;
            this.address = address;
    }
    public String getInfo() {
        return "Purchase cost:" + this.purchaseCost +
               "  Building color:" + this.buildingColor +
                "  Owner name:" + this.ownerName +
               this.address.getInfo();
    }
    public abstract double calculateVolume();
}
     


