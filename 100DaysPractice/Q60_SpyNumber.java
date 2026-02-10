public class Q60_SpyNumber {
    public static void main(String[] args) {
        int num = 1124;
        int sum = 0;
        int product = 1;
        
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            num = num / 10;
        }
        
        if (sum == product) {
            System.out.println("It is a Spy Number.");
        } else {
            System.out.println("It is not a Spy Number.");
        }
    }
}