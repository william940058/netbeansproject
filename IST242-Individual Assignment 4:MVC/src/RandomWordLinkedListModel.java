
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author macbookpro
 */
public class RandomWordLinkedListModel {
    
    private LinkedList<String> link = new LinkedList<>();
    
    public RandomWordLinkedListModel() {
        link.add("dog");
        link.add("cat");
        link.add("fish");
    }
    public String getWord()
    {
        // This can be modified to return random words:  The View and
        // Controller won't care!
         Random rand = new Random();
        String randomElement = link.get(rand.nextInt(link.size()));
        return randomElement;
    }
    public void putWord(String word){
        link.add(word);
    }
}
