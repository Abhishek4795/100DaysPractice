import java.util.LinkedHashMap;
import java.util.Map;

public class Q18_FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        // LinkedHashMap maintains the order of insertion
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated char: " + entry.getKey());
                break; // Stop after finding the first one
            }
        }
    }
}