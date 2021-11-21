package listgettimer;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;
import java.util.Map;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ListGetTimer {

    private final ArrayList<GeographicRegion> theArrayList;
    private final LinkedList<GeographicRegion> theLinkedList;

    private static final long NUMBER_OF_GETS = 100000;
    private long sm;

    public ListGetTimer() throws IOException {
        theArrayList = new ArrayList<>();
        theLinkedList = new LinkedList<>();
        addDataToLists();
    }

    public static void main(String[] args) throws IOException {

        ListGetTimer timer = new ListGetTimer();

        long avgTimeToGetItemFromArrayList = timer.calcAvgTimeOfListGet(timer.theArrayList);
        long avgTimeToGetItemFromLinkedList = timer.calcAvgTimeOfListGet(timer.theLinkedList);

        System.out.println("The average time to get an item from the Array List is "
                + avgTimeToGetItemFromArrayList + " nanoseconds.");
        System.out.println("The average time to get an item from the Linked List is "
                + avgTimeToGetItemFromLinkedList + " nanoseconds.");

    }

    private void addDataToLists() throws IOException {
        String area;
        CSVReaderHeaderAware csvRA = new CSVReaderHeaderAware(new FileReader("regionAndAreas"));
        CSVReader reader = csvRA;
        while (reader.readNext() != null) {
            Map<String, String> values = csvRA.readMap();
            for (Map.Entry<String, String> entry : values.entrySet()) {
                for (Map.Entry<String, String> ent : values.entrySet()) {
                    String countryName = entry.getValue();
                    area = ent.getValue();
                    GeographicRegion geoRegion = new GeographicRegion(countryName, area);
                    theArrayList.add(geoRegion);
                    theLinkedList.add(geoRegion);
                }
            }
        }
    }

    private long calcAvgTimeOfListGet(List<GeographicRegion> list) {
        Random rnd = ThreadLocalRandom.current();
        long startTime = System.nanoTime();
        for(int runs = 0; runs < NUMBER_OF_GETS; runs++)
        {
            list.get(rnd.nextInt(list.size())); 
        }
        long endTime = System.nanoTime();
        long avgTime = (endTime - startTime)/NUMBER_OF_GETS;
        return avgTime;

    }
}
