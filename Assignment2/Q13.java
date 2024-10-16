/*
 * . Write a Java program to explain “multilevel inheritance".
 *   
 */
public class Q13 {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class GrandParent {
    void show() {
        System.out.println("Grandparent Class");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child Class");
    }
}
