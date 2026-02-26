public class Q83_PerfectSquare {
    public static void main(String[] args) {
        int num = 49; // 7 * 7 = 49
        boolean isPerfectSquare = false;
        
        // Loop from 1 to half of the number
        for (int i = 1; i * i <= num; i++) {
            // If square of 'i' equals num, it's a perfect square
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }
        
        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}