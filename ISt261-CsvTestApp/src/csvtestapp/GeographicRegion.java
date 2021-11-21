package csvtestapp;

public class GeographicRegion {

    private final String Name;
    private final double Area;

    public GeographicRegion(String Name, double Area) {
        this.Name = Name;
        this.Area = Area;
    }

    @Override
    public String toString() {
        return "name: " + Name + "; area: " + Area + " sq. km";
    }

}
