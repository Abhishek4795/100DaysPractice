public class Q7_ReverseWords {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed words: " + reversed.toString().trim());
    }
}