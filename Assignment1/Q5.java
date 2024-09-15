import java.util.Scanner;

// Write a Java program to convert miles to kilometers.
public class Q5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in miles:");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles is " + kilometers + " kilometers.");

        
    }
}
