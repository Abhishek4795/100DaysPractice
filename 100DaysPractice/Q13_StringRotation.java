public class Q13_StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        // If lengths are not equal, they can't be rotations
        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
            return;
        }

        // Concatenate str1 with itself. If str2 is a rotation, 
        // it will be a substring of this concatenated string.
        String concatenated = str1 + str1;

        if (concatenated.contains(str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println("Not a rotation");
        }
    }
}