public class Q8_SortStringChars {
    public static void main(String[] args) {
        String str = "edcba";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println("Sorted String: " + new String(chars));
    }
}