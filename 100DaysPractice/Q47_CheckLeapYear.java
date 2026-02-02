public class Q47_CheckLeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = false;
        
        // A year is a leap year if it is divisible by 4
        // But if it is divisible by 100, it must also be divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        }
        
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}