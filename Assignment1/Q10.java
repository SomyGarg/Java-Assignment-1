import java.util.*;

// Write a Java program for Fibonacci series.
public class Q10 {
    public static int fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        int fibo = fibonacci(n-1) + fibonacci(n-2);

        return fibo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
