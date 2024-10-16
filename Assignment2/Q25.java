// Write a program to raise a user defined exception if username is less than 6 characters and 
// password does not match.
public class Q25 {
    public static void main(String[] args) {
        String username = "user"; // Example username
        String password = "pass123";
        String confirmPassword = "pass124"; // Example password

        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username is too short.");
            }
            if (!password.equals(confirmPassword)) {
                throw new PasswordMismatchException("Passwords do not match.");
            }
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}