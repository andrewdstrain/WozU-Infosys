import java.util.*;

public class Solution {
    public static List<String> topKFrequent(String[] words, int k) {
        // Initializations
        Map<String, WordCount> map = new HashMap<>();
        List<String> topWords = new ArrayList<>();

        // Loop through words
        for (String word : words) {
            if (map.containsKey(word)) {
                // Increment word count if it's already there
                map.get(word).increment();
            } else {
                // Otherwise, add it to the Map
                map.put(word, new WordCount(word));
            }
        }

        // Sort by count (highest to lowest) and then by word
        List<WordCount> sorted = new ArrayList<>(map.values());
        Collections.sort(sorted);

        // Only the top K words are returned
        for (int i = 0; i < k; i++) {
            topWords.add(sorted.get(i).getWord());
        }

        return topWords;
    }
}