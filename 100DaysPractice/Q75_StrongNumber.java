public class Q75_StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int totalSum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            // Find factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            totalSum = totalSum + fact;
            temp = temp / 10;
        }
        
        if (totalSum == num) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }
    }
}