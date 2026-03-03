// Grandparent class
class Grandfather {
    void showGrandfather() {
        System.out.println("I am the Grandfather.");
    }
}

// Parent class inheriting Grandparent
class Father extends Grandfather {
    void showFather() {
        System.out.println("I am the Father.");
    }
}

// Child class inheriting Parent
class Son extends Father {
    void showSon() {
        System.out.println("I am the Son.");
    }
}

public class Q95_MultiLevelInheritance {
    public static void main(String[] args) {
        // Create object of the lowest child class
        Son mySon = new Son();
        
        // Son can access methods of all classes above him
        mySon.showGrandfather();
        mySon.showFather();
        mySon.showSon();
    }
}