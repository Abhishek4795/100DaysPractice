public class Q68_FloydsTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        
        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // Go to next line
        }
    }
}