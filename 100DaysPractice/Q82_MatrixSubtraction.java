public class Q82_MatrixSubtraction {
    public static void main(String[] args) {
        int[][] mat1 = {{5, 5, 5}, {6, 6, 6}, {7, 7, 7}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Create a new matrix to store the result
        int[][] diff = new int[3][3];
        
        System.out.println("Difference of Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Subtract corresponding elements
                diff[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(diff[i][j] + " ");
            }
            System.out.println(); // Next line for new row
        }
    }
}