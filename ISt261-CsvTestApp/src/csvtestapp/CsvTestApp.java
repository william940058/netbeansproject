package csvtestapp;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CsvTestApp {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<GeographicRegion> list = new ArrayList<>();
        addGeographicRegions(list);
        Chooser chooser = new Chooser(list);
        for(int num = 1; num <= 10; num++){
            System.out.println(chooser.choose());
        }
    }
        
    private static void addGeographicRegions(ArrayList<GeographicRegion> list) throws IOException{    
        String area;
        CSVReaderHeaderAware csvRA = new CSVReaderHeaderAware(new FileReader("Data.csv"));
        CSVReader reader = csvRA;
        while(reader.readNext() != null){
            Map<String, String> values = csvRA.readMap();
            for(Map.Entry<String, String> entry : values.entrySet()){
                if(entry.getKey().compareTo("Country Name") ==0 ){
                    for(Map.Entry<String, String> ent : values.entrySet()){
                        String countryName = entry.getValue();
                        if(ent.getKey().compareTo("2017") == 0){
                            if("".equals(ent.getValue())){
                                area = "NO DATA";
                            }
                            else{
                                area = ent.getValue();
                            }
                            GeographicRegion geoRegion = new GeographicRegion(countryName, Double.parseDouble(area));
                            list.add(geoRegion);
                        }
                    }
                }
            }
        }
    }
}

