public class Q17_RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        // Iterate through characters and append only non-space characters
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ' && charArray[i] != '\t') {
                sb.append(charArray[i]);
            }
        }

        System.out.println("Without spaces: " + sb.toString());
    }
}