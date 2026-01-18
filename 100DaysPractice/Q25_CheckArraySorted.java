public class Q25_CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean isSorted = true;

        // Iterate through the array and compare adjacent elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break; // Array is not sorted, stop checking
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}