public class Q6_ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 9, 86, 24};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }
        System.out.println("Third Largest: " + third);
    }
}