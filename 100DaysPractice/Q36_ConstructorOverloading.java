class Box {
    double width, height, depth;

    // Constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified
    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    // Constructor used when a cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class Q36_ConstructorOverloading {
    public static void main(String[] args) {
        // Creating boxes using different constructors
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        System.out.println("Volume of myBox1 is: " + myBox1.volume());
        System.out.println("Volume of myBox2 is: " + myBox2.volume());
        System.out.println("Volume of myCube is: " + myCube.volume());
    }
}