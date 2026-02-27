public class Q86_CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = 37.0; // Normal body temperature
        
        // Formula: F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println(celsius + " Degree Celsius is equal to ");
        System.out.println(fahrenheit + " Degree Fahrenheit.");
    }
}