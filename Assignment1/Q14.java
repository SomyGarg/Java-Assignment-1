import java.util.Scanner;

//Write a Java program to print all multiple of 10 between a given interval.
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input start and end of the interval
        System.out.println("Enter start ");
        int start = sc.nextInt();
        System.out.println("Enter end");
        int end = sc.nextInt();
        
        System.out.println("Numbers multiple 10 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
