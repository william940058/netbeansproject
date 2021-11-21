
import java.util.LinkedList;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedList<String> nameList = new LinkedList();

        nameList.add("Adam");
        nameList.add("Beth");
        nameList.add("Cindy");

        nameList.addFirst("First");
        nameList.addLast("Last");

        int bethPos = nameList.indexOf("Beth");
        String bethVal = nameList.get(bethPos);

        nameList.add(bethPos + 1, "Someone after Beth");
        System.out.println(nameList);

    }

}
