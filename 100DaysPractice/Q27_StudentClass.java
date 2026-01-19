// Defining the Student class
class Student {
    String name;
    int rollNo;

    // Constructor to initialize student data
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    // Method to display details
    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Q27_StudentClass {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student("Abhishek", 101);
        Student s2 = new Student("Rahul", 102);

        // Calling the display method
        s1.display();
        s2.display();
    }
}