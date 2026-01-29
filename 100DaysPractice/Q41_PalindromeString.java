public class Q41_PalindromeString {
    public static void main(String[] args) {
        String original = "madam";
        String reverse = "";
        
        // Read the string from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        
        // Compare original and reversed string
        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}