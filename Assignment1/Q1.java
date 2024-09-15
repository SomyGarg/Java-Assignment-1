import java.util.*;
// Write a Java program to change temperature from Celsius to Fahrenheit and vice versa
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to convert Celsius to Fahrenheit, 2 for Fahrenheit to Celsius:");
        int choice = scanner.nextInt();

        System.out.println("Enter the temperature:");
        double temp = scanner.nextDouble();

        switch (choice) {
            case 1:
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println(temp + " Celsius is " + fahrenheit + " Fahrenheit.");
                break;
            case 2:
                double celsius = (temp - 32) * 5 / 9;
                System.out.println(temp + " Fahrenheit is " + celsius + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
