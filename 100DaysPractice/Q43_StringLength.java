public class Q43_StringLength {
    public static void main(String[] args) {
        String str = "programming";
        int length = 0;
        
        // Convert string to a character array
        char[] charArray = str.toCharArray();
        
        // Count each character one by one
        for (char c : charArray) {
            length++;
        }
        
        System.out.println("The length of the string is: " + length);
    }
}