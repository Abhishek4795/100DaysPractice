public class Q85_SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000; // Original amount
        double rate = 5.5;        // Interest rate in percentage
        int time = 3;             // Time in years
        
        // Formula: SI = (P * R * T) / 100
        double interest = (principal * rate * time) / 100;
        
        System.out.println("Principal Amount: " + principal);
        System.out.println("Simple Interest is: " + interest);
        System.out.println("Total Amount to pay: " + (principal + interest));
    }
}