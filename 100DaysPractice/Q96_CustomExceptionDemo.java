// Creating a custom exception class extending Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        // Pass message to parent Exception class
        super(message); 
    }
}

public class Q96_CustomExceptionDemo {
    // Method that throws our custom exception
    static void validateVotingAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Welcome to vote!");
        }
    }
    
    public static void main(String[] args) {
        try {
            validateVotingAge(16); // This will cause an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}