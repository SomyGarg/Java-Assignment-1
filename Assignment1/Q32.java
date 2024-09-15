//  Write a Java program to show parameterized constructor.
class MyClass {
    int value;

    public MyClass(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called with value: " + value);
    }
}

public class Q32 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
    }
}
