


//GROUP: WEILUN, KAITLYN, JOEY
package wordfrequencycounterfinishinclass;

import java.util.Map;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class WordFrequencyCounterFinishInClass {

    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = {"dog", "cat", "cat", "elk", "dog", "cow", "cat", "elk", "dog", "cow"};
        for (String word : words) {
            if(!wordCount.containsKey(word)){
                wordCount.put(word, 1);  
            }
            else{ 
                int count = wordCount.get(word);
                wordCount.put(word, count+1); 
            }
        }
        SortedMap<String, Integer> sort = new TreeMap<>();
        sort.putAll(wordCount);
        System.out.println(sort);
    }
}


