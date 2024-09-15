import java.util.Scanner;

// Write a Java program to calculate factorial of 12.
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        if (number == 0 || number == 1) {
            factorial = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
        }
        System.out.println(factorial);

    }
}
