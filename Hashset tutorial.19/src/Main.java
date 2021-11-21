
import java.util.HashSet;


public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Cat> cats = new HashSet();
        cats.add(new Cat("apple", "b", 9));
        cats.add(new Cat("apple", "b", 9));
        cats.add(new Cat("ball", "c", 10));
        cats.add(new Cat("apple", "d", 10));
        cats.add(new Cat("cow", "c", 11));
        
        for(Cat c : cats) {
            System.out.println(c);
        }
    }
    
}
