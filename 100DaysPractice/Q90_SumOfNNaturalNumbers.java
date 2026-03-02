public class Q90_SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 50; // We want sum from 1 to 50
        int sum = 0;
        
        // Run loop from 1 to N and keep adding
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}