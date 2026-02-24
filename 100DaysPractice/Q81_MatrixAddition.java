public class Q81_MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        // Create a new matrix to store the result
        int[][] sum = new int[3][3];
        
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Add corresponding elements
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // Next line for new row
        }
    }
}