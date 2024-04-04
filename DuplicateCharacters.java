 import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello world";

        // Convert the string to lowercase to handle case-insensitive comparison
        str = str.toLowerCase();

        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the characters of the string
        for (char ch : str.toCharArray()) {
            // Increment count if character is already present in the map
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Add character to map with count 1 if it's not already present
                charCountMap.put(ch, 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

