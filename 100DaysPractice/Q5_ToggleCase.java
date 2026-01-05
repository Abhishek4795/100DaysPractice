public class Q5_ToggleCase {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) toggled.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) toggled.append(Character.toUpperCase(c));
            else toggled.append(c);
        }
        System.out.println("Toggled: " + toggled.toString());
    }
}