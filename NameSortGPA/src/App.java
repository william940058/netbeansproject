
import java.util.ArrayList;
import java.util.Collections;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> cats = new ArrayList();
        cats.add("Whiskers");
        cats.add("Tom");
        cats.add("snowbell");
        
        System.out.println(cats);
        Collections.sort(cats);
        System.out.println(cats);
        
        ArrayList<Student> students = new ArrayList();
        
        students.add(new Student("Wendy", 3.8));
        students.add(new Student("Aaron", 2.1));
        students.add(new Student("Jane", 2.0));
        
        Collections.sort(students);
        System.out.println(students);
    }
    
}
