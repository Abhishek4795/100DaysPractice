public class Q73_ArrayLeftRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Store the first element in a temporary variable
        int firstElement = arr[0];
        
        // Shift all other elements one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Put the first element at the last position
        arr[arr.length - 1] = firstElement;
        
        System.out.print("Array after left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}