class StudentInfo {
    int rollno;
    String name;
    // Static variable is shared by all objects of this class
    static String college = "ABC College"; 
    
    StudentInfo(int r, String n) {
        rollno = r;
        name = n;
    }
    
    void display() {
        System.out.println("Roll: " + rollno + ", Name: " + name + ", College: " + college);
    }
}

public class Q49_StaticKeywordDemo {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(101, "Rahul");
        StudentInfo s2 = new StudentInfo(102, "Amit");
        
        // Both students will have the same college name
        s1.display();
        s2.display();
    }
}