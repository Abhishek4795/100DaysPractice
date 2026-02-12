public class Q63_FactorsOfNumber {
    public static void main(String[] args) {
        int number = 60;
        
        System.out.print("Factors of " + number + " are: ");
        // Check all numbers from 1 to the number itself
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}