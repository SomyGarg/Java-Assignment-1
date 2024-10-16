// Create a general class ThreeDObject and derive the classes Box, Cube,
// Cylinder and
// Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and
// volume ().
// Override these two methods in each of the derived classes to calculate the
// volume and
// whole surface area of each type of three-dimensional objects. The dimensions
// of the
// objects are to be taken from the users and passed through the respective
// constructors of
// each derived class. Write a main method to test these classes

public class Q9 {
    public static void main(String[] args) {
        Box box = new Box(3, 4, 5);
        Cube cube = new Cube(3);
        Cylinder cylinder = new Cylinder(3, 5);
        Cone cone = new Cone(3, 5);

        System.out.println("Box - Volume: " + box.volume() + ", Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Cube - Volume: " + cube.volume() + ", Surface Area: " + cube.wholeSurfaceArea());
        System.out
                .println("Cylinder - Volume: " + cylinder.volume() + ", Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cone - Volume: " + cone.volume() + ", Surface Area: " + cone.wholeSurfaceArea());
    }

}

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();

    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        side = s;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}
