public class Q19_CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Education";
        int vowels = 0, consonants = 0;
        
        // Convert to lower case to handle both uppercase and lowercase easily
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // Check if character is a consonant (between a and z)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}