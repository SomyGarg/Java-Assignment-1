/*Write a java program to create an custom Exception that would handle at least 2 kind of 
Arithmetic Exceptions while calculating a given equation */
public class Q22 {
    public static void main(String[] args) {
        try {
            int result = calculate(10, 0);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculate(int a, int b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
