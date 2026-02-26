public class Q84_CalculateAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        
        // First calculate the sum of all elements
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        
        // Average is total sum divided by number of elements
        // Convert sum to double to get decimal answer if needed
        double average = (double) sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}