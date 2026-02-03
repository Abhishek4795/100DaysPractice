class Employee {
    int id;
    String name;
    
    // Constructor parameters have the same name as instance variables
    Employee(int id, String name) {
        // 'this' is used to resolve ambiguity between instance variable and parameter
        this.id = id; 
        this.name = name;
    }
    
    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

public class Q50_ThisKeywordDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(505, "Suresh");
        emp1.display();
    }
}