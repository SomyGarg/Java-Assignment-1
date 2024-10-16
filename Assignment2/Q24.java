/* Consider an Employee recruitment system that prints the candidate name based on the 
age criteria. The name and age of the candidate are taken as Input.Create two user-defined 
exceptions named “TooOlder” and “TooYounger”
If age>45, throw exception “TooOlder”.
If age<20, throw exception “TooYounger”.
Otherwise, print “Eligible” and print the name of the candidate. */
public class Q24 {
    public static void main(String[] args) {
        int age = 46; // Example age
        String name = "John";

        try {
            if (age > 45) {
                throw new TooOlderException("Too Old!");
            } else if (age < 20) {
                throw new TooYoungerException("Too Young!");
            } else {
                System.out.println("Eligible: " + name);
            }
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}

class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}
