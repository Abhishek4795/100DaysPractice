public class Q94_ReplaceSpaces {
    public static void main(String[] args) {
        String str = "Java is very interesting";
        char replaceWith = '-';
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is a space
            if (ch == ' ') {
                result = result + replaceWith;
            } else {
                result = result + ch;
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Modified: " + result);
    }
}