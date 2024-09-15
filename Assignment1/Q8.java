import java.util.Scanner;

// Write a Java program to check whether a number is divisible by a number given by user
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be checked:");
        int number = scanner.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor);
            } else {
                System.out.println(number + " is not divisible by " + divisor);
            }
        } else {
            System.out.println("Divisor cannot be zero.");
        }
    }
}
