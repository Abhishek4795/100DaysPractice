// Declaring an interface
interface Printable {
    void print(); // Abstract method by default
}

// Implementing the interface in a class
class Document implements Printable {
    public void print() {
        System.out.println("Hello, printing the document!");
    }
}

public class Q37_BasicInterface {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}