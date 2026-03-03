public class Q98_HollowSquarePattern {
    public static void main(String[] args) {
        int size = 5;
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print star for first/last row and first/last column
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    // Print space everywhere else inside
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}