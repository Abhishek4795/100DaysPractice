public class Q65_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 6};
        int count = 0; // Count of non-zero elements
        
        // Traverse the array. If element is non-zero, put it at 'count' index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        
        // Now make all elements from count to end as 0
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        
        System.out.print("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}