public class Q77_PrintASCIIValues {
    public static void main(String[] args) {
        String str = "ABC";
        
        System.out.println("ASCII values for string '" + str + "':");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch; // Casting character to integer gives ASCII value
            System.out.println(ch + " = " + asciiValue);
        }
    }
}