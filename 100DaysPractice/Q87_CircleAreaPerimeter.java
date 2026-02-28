public class Q87_CircleAreaPerimeter {
    public static void main(String[] args) {
        double radius = 5.0;
        double pi = 3.14159;
        
        // Area formula: PI * r * r
        double area = pi * radius * radius;
        
        // Perimeter (Circumference) formula: 2 * PI * r
        double perimeter = 2 * pi * radius;
        
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}