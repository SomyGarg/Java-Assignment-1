public class Q7 {
    // Write a Java program to show method overriding.
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); 
    }

}

class Parent {
    void display() {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is child class.");
    }
}
