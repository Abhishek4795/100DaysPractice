// A class with private variables and public methods to access them
class Person {
    private String name;
    private int age;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String newName) {
        this.name = newName;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int newAge) {
        if(newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
}

public class Q91_EncapsulationDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        
        // Setting values using setters
        p1.setName("Abhishek");
        p1.setAge(21);
        
        // Getting values using getters
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}