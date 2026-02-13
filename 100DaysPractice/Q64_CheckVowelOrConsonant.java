public class Q64_CheckVowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'E';
        
        // Convert to uppercase to handle both cases easily
        ch = Character.toUpperCase(ch);
        
        // Check if character is an alphabet letter
        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Not an alphabet.");
        }
    }
}