public class Q61_NeonNumber {
    public static void main(String[] args) {
        int num = 9; // Neon number example: 9 (9*9=81 -> 8+1=9)
        int square = num * num;
        int sumOfDigits = 0;
        
        while (square > 0) {
            int digit = square % 10;
            sumOfDigits = sumOfDigits + digit;
            square = square / 10;
        }
        
        if (sumOfDigits == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
    }
}