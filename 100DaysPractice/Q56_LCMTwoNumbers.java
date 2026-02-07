public class Q56_LCMTwoNumbers {
    public static void main(String[] args) {
        int n1 = 12, n2 = 15;
        int lcm = 0;
        
        // LCM is always greater than or equal to the maximum of the two numbers
        int max = (n1 > n2) ? n1 : n2;
        
        // Loop until we find a number divisible by both
        while (true) {
            if (max % n1 == 0 && max % n2 == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        
        System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }
}