// Abstract class doesn't have a body for its abstract methods
abstract class Shape {
    abstract void draw();
}

// Child class provides the implementation
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

public class Q48_AbstractClassDemo {
    public static void main(String[] args) {
        // You cannot create an object of an abstract class directly
        // But you can use parent reference for a child object
        Shape myShape = new Circle();
        myShape.draw();
    }
}