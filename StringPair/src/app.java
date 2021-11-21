
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class app {

    /**
     * @param args the command line arguments
     */
    /*public static <T> String combineInputs(T input1, T input2) {
        return input1.toString() + input2.toString();
    }
    
    public static <T extends Number, S extends String> String combineInputs(T input1,T input2, S input3){
        return input1.doubleValue() +input2.doubleValue() + input3.toString();
    }
    
    
    
    
    
    
    
    public static Pair getRunnerInfo() {
        return new Pair<Double, String>(23.43, "Jane Smith");
    }*/
    public static void main(String[] args) {

        HashSet<String> magazineSubs = new HashSet();

        magazineSubs.add("Guitar Player");
        magazineSubs.add("MTB action");

        magazineSubs.add("Newsweek");
        magazineSubs.add("Newsweek");
        magazineSubs.add("Newsweek");

        magazineSubs.remove("Newsweek");

        if (magazineSubs.contains("Guitar Player")) {
            System.out.println("u r Guitar player");
        }
        for (String mag : magazineSubs) {
            System.out.println(magazineSubs);
        }

        /*ArrayList<String> names = new ArrayList();
        ArrayList<String> Nicknames = new ArrayList();
        
        ArrayList<ArrayList<String>> listOfLists = new ArrayList();
        listOfLists.add(names);
        listOfLists.add(Nicknames);
        
        
        
        HashMap<String,Integer> salaryLookup = new HashMap();
        
        salaryLookup.put("Joe Smith", 54000);
        salaryLookup.put("Jane Doe", 86000);
        salaryLookup.put("John employee", 75000);
        
        if(salaryLookup.containsKey("Jane Doe")) {
            System.out.println("Salary: " + salaryLookup.get("Jane Doe"));
        }
        else {
            System.out.println("Employee not found.");
        }*/
// TODO code application logic here
        //Integer i1 = 6;
        //Integer i2 = 9;
        //double d1 = 34.2;
        //double d2 = 124.4;
        //System.out.println(combineInputs(i1, d2));
        //Pair<Double, String> racer = getRunnerInfo();
        //System.out.println(racer);
    }

}
