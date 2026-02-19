public class Q74_AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25; // 25*25 = 625 (ends with 25)
        int square = num * num;
        boolean isAutomorphic = true;
        
        int tempNum = num;
        // Match last digits of square with the number
        while (tempNum > 0) {
            if (tempNum % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            tempNum = tempNum / 10;
            square = square / 10;
        }
        
        if (isAutomorphic) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is not an Automorphic Number.");
        }
    }
}