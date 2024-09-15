import java.util.*;

public class Q30 {
    // Write a Java program to print every alternate number of a given array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("alternate number");
        for (int i = 0; i < arr.length; i+= 2) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
