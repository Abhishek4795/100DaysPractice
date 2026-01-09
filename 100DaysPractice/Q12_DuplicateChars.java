import java.util.HashMap;
import java.util.Map;

public class Q12_DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Build the frequency map
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print characters that appear more than once
        System.out.println("Duplicate characters in '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}