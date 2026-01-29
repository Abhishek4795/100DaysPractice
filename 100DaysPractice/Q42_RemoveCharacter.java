public class Q42_RemoveCharacter {
    public static void main(String[] args) {
        String str = "hello world";
        char chToRemove = 'l';
        String result = "";
        
        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            // If the character is not the one we want to remove, add it to result
            if (str.charAt(i) != chToRemove) {
                result = result + str.charAt(i);
            }
        }
        
        System.out.println("Original String: " + str);
        System.out.println("String after removing '" + chToRemove + "': " + result);
    }
}