public class Q76_StringToInteger {
    public static void main(String[] args) {
        String str = "1234";
        int result = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Subtracting '0' (ASCII 48) gives the actual integer value
            int digit = ch - '0';
            result = (result * 10) + digit;
        }
        
        System.out.println("Converted Integer: " + result);
    }
}