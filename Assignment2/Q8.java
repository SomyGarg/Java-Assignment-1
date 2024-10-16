public class Q8 {
    //  Write a Java program to show method hiding.
    class Parent {
        static void show() {
            System.out.println("This is the parent class.");
        }
    }
    
    class Child extends Parent {
        static void show() {
            System.out.println("This is the child class.");
        }
    }

    public static void main(String[] args) {
        Parent.show();  
        Child.show();   
    }
}
