public class Q92_StringToLowerCase {
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // ASCII of 'A' is 65, 'a' is 97. Difference is 32.
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            result = result + ch;
        }
        
        System.out.println("Original: " + str);
        System.out.println("Lowercase: " + result);
    }
}