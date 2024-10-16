/*
 * Write a program to input name and age of a person and throw a user-defined exception, if 
the entered age is negative.
 */
public class Q26 {
    public static void main(String[] args) {
        String name = "John";
        int age = -5; 

        try {
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            } else {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}
