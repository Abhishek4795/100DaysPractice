import java.util.HashSet;

public class Q16_ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Add all elements of first array to a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        System.out.print("Intersection: ");
        // Check which elements of second array are present in the set
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                // Remove the element to avoid printing duplicates
                set.remove(arr2[i]);
            }
        }
    }
}