import java.util.Scanner;

// Write a Java program to reverse a number.
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            rev = rev * 10 + a;
        }
        System.out.println(rev);
    }
}
