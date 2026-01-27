public class Q39_CheckArraysEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean isEqual = true;
        
        // First, check if lengths are same. If not, they can't be equal.
        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {
            // Loop through and check element by element
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break; // Stop checking if a mismatch is found
                }
            }
        }
        
        if (isEqual) {
            System.out.println("Both arrays are perfectly equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}