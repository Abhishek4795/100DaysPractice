public class Q67_MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = new int[arr1.length + arr2.length];
        
        int pos = 0;
        
        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            result[pos] = arr1[i];
            pos++;
        }
        
        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            result[pos] = arr2[i];
            pos++;
        }
        
        System.out.print("Merged Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}