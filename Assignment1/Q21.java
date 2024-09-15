import java.util.Scanner;
// Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Decimal to Binary
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary " + binary);
        
        // Binary to Decimal
        System.out.println("Enter a binary number: ");
        String binaryInput = sc.next();
        int decimalEquivalent = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal " + decimalEquivalent);
    }
}
