//implement:interface vs extends:abstract
//multiple inheritance vs one inheritance
public class Package implements measurable, Comparable<Package> {
    private String name;
    private Double weight;
    private int trackingNum;
    private String address;
    
    public Package(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public int compareTo(Package packages) {
        int compare = this.weight.compareTo(packages.weight);
        return compare;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Weight: " + weight + "kg\n";
    }
    
    @Override
    public int getTrackingNum() {
        return trackingNum;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public int calculateCost() {
        int quantity = 3;
        int cost = quantity * SHIPPINGCOST_PER_PACKAGE;
        return cost;
    }
}
