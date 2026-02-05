public class Q52_BinarySearch {
    public static void main(String[] args) {
        // Array must be sorted for Binary Search
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int target = 44;
        
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        
        while (start <= end) {
            int mid = (start + end) / 2; // Find the middle element
            
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1; // Target is in the right half
            } else {
                end = mid - 1;   // Target is in the left half
            }
        }
        
        if (!found) {
            System.out.println("Element not found.");
        }
    }
}