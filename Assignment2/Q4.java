// Write a Java program to show constructor overloading.
public class Q4 {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example(5);
        Example obj3 = new Example(10, 15);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
class Example {
    int x;
    int y;

    Example() {
        x = 0;
        y = 0;
    }

    Example(int a) {
        x = a;
        y = 0;
    }

    Example(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}