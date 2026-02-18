public class Q71_CompareStringsNoEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isSame = true;
        
        if (str1.length() != str2.length()) {
            isSame = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
        }
        
        if (isSame) {
            System.out.println("Strings are exactly the same.");
        } else {
            System.out.println("Strings are different.");
        }
    }
}