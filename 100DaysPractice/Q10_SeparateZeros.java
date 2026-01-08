public class Q10_SeparateZeros {
    public static void main(String[] args) {
        int[] arr = {12, 0, 7, 0, 8, 0, 3};
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        for (int i : arr) System.out.print(i + " ");
    }
}