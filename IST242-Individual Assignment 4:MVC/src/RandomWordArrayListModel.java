
import java.util.ArrayList;
import java.util.Random;

public class RandomWordArrayListModel {
    private ArrayList<String> list; 
    
    RandomWordArrayListModel()
    {
        this.list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("fish");
    }
    public String getWord()
    {
        // This can be modified to return random words:  The View and
        // Controller won't care!
        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        return randomElement;
        
    }
    public void putWord(String word){
        list.add(word);
        
    }
}
