package listgettimer;

/**
 * data from http://api.worldbank.org/v2/en/indicator/AG.LND.TOTL.K2?downloadformat=csv
 * from file API_AG.LND.TOTL.K2_DS2_en_csv_v2_10140368.csv
 */
public class GeographicRegion {
    
    private final String name;
    private final String area; // in sq. km. -- 

    public GeographicRegion(String name, String area) {
        this.name = name;
        this.area = area;
    }
    
}
