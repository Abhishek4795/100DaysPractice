import java.util.Arrays;

public class Q97_CheckSameElementsArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 4, 1, 2};
        
        boolean isSame = true;
        
        // Length must be same first
        if (arr1.length != arr2.length) {
            isSame = false;
        } else {
            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            // Compare sorted arrays
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isSame = false;
                    break;
                }
            }
        }
        
        if (isSame) {
            System.out.println("Arrays contain the same elements.");
        } else {
            System.out.println("Arrays do not contain the same elements.");
        }
    }
}