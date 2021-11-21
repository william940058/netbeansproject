
import java.util.Scanner;


/**
 *
 * @author jrimland
 */

public class App {
    public static void main(String[] args) {
        RandomWordArrayListModel model = new RandomWordArrayListModel();
        RandomWordLinkedListModel list = new RandomWordLinkedListModel();
        SimpleRandomWordView view = new SimpleRandomWordView(model);
        SimpleRandomWordView lView = new SimpleRandomWordView(list);
        FancyRandomWordView fView = new FancyRandomWordView(model);
        FancyRandomWordView fLView = new FancyRandomWordView(list);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Would u like an ArrayList or LinkedList model?");
        String type = in.next();
        System.out.println("Would u like a Simple or Fancy view?");
        String types = in.next();
        
        if(type.equalsIgnoreCase("Arraylist") && types.equalsIgnoreCase("Simple")){
            RandomWordController c1 = new RandomWordController(model, view);
            view.setVisible(true);
        }
        else if (type.equalsIgnoreCase("LinkedList") && types.equalsIgnoreCase("Simple")){
            RandomWordController c2 = new RandomWordController(list, lView);
            lView.setVisible(true);
        }
        else if (type.equalsIgnoreCase("ArrayList") && types.equalsIgnoreCase("Fancy")){
            RandomWordController c3 = new RandomWordController(model, fView);
            fView.setVisible(true);
        }
        else if (type.equalsIgnoreCase("LinkedList") && types.equalsIgnoreCase("Fancy")){
            RandomWordController c4 = new RandomWordController(list, fLView);
            fLView.setVisible(true);
        } 
       
    }
}


