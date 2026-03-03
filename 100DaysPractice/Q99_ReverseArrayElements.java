public class Q99_ReverseArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] reversedArr = new int[arr.length];
        
        int j = 0; // index for new array
        
        // Traverse from the end of the original array
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }
        
        System.out.print("Original Array: ");
        for (int num : arr) System.out.print(num + " ");
        
        System.out.print("\nReversed Array: ");
        for (int num : reversedArr) System.out.print(num + " ");
    }
}