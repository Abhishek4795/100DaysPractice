import java.util.Arrays;

public class Q20_CheckAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        boolean isAnagram = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Both strings are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}