
import java.util.Scanner;



public class Salaries {

    /**
     * @param args the command line arguments
     */
    public static <T> String combineInputs(T input1, T input2) {
        return input1.toString() + input2.toString();
    }
    
    public static <T extends Number, S extends String> String combineInputs(T input1,T input2, S input3){
        return input1.doubleValue() +input2.doubleValue() + input3.toString();
    }
    
    
    
    
    
    
    
    public static Pair getEmployeeInfo() {
        Scanner in = new Scanner(System.in);
        return new Pair<Double, String>(33.5, "00");
    }
            
            
    
    
    public static void main(String[] args) {
        ;
        
        Pair<Double, String> employee = getEmployeeInfo();
        System.out.println(employee);
    }
    
    
}
