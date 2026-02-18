public class Q72_CountPunctuation {
    public static void main(String[] args) {
        String str = "Hello! How are you? I'm fine, thank you.";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check for common punctuation marks
            if (ch == '!' || ch == ',' || ch == ';' || ch == '.' || ch == '?' || ch == '-' || ch == '\'') {
                count++;
            }
        }
        System.out.println("Total punctuation marks: " + count);
    }
}