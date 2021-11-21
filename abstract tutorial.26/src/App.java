
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
        skiier s1 = new skiier();
        Teacher t1 = new Teacher();
        
        
        ArrayList<Person> people = new ArrayList();
        people.add(s1);
        people.add(t1);
        
        for (Person person: people)
        {
            person.sayHello();
        }
        
        
        
        
        
        
        
        //Object can store anything
        ArrayList<Object> superAmazingListOfAnything = new ArrayList();
        superAmazingListOfAnything.add(54.1);
        superAmazingListOfAnything.add("Hi, there ");
        superAmazingListOfAnything.add(new Scanner(System.in));
        superAmazingListOfAnything.add(3920);
        System.out.println(superAmazingListOfAnything.get(3));
        
    }
    
}



