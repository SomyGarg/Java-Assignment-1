public class Q5 {
    // Write a Java program to implement the concept of inheritance.
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.bark();
    }

}

class Animal {
    void eat() {
        System.out.println("animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

