public class Q30_CountWordsString {
    public static void main(String[] args) {
        String str = "Java is a simple language";
        
        // Assume there is at least one word if the string isn't empty
        int wordCount = 1; 

        for (int i = 0; i < str.length() - 1; i++) {
            // A word boundary is a space followed by a character
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }

        System.out.println("The string is: " + str);
        System.out.println("Total words: " + wordCount);
    }
}