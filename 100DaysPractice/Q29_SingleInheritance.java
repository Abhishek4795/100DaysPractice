// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Q29_SingleInheritance {
    public static void main(String[] args) {
        // Create object of the child class
        Dog myDog = new Dog();
        
        // Accessing methods of both parent and child class
        myDog.eat();  // Inherited method
        myDog.bark(); // Its own method
    }
}