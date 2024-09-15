import java.util.*;

//  Write a Java program to find maximum of three numbers.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = Math.max(a, b);
        int max = Math.max(c, d);
        System.out.println("maximum number is =" + max);
    }
}
