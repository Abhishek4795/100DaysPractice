public class Q89_LargestOfThree {
    public static void main(String[] args) {
        int a = 25, b = 78, c = 87;
        
        // Nested if-else logic
        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " is the largest.");
            } else {
                System.out.println(c + " is the largest.");
            }
        } else {
            if (b >= c) {
                System.out.println(b + " is the largest.");
            } else {
                System.out.println(c + " is the largest.");
            }
        }
    }
}