import java.util.Scanner;

public class Q20 {
    // Write a Java program to check whether a number is prime or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        boolean b = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                b = true;
                break;
            }
        }

        if (b) {
            System.out.println("n is not prime");
        }else{
            System.out.println("n is a prime number");
        }
    }
}
