public class Q34_RightTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        
        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars for a row
            System.out.println();
        }
    }
}