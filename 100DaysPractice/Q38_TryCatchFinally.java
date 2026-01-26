public class Q38_TryCatchFinally {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        try {
            System.out.println("Inside try block");
            // Trying to access an index that doesn't exist to cause an exception
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        } finally {
            // This block will always execute, no matter what happens
            System.out.println("Inside finally block: This always runs.");
        }
        
        System.out.println("Rest of the code continues...");
    }
}