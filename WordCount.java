import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world hello world";

        // Split the string into words
        String[] words = str.split("\\s+");

        // Create a HashMap to store word count
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the words array
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word count
        System.out.println("Word count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
