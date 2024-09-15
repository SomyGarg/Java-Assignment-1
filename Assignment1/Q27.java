import java.util.*;

public class Q27 {
    // Write a Java program to enter n elements in an array and find smallest number
    // among them.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
       Arrays.sort(arr);
       System.out.println("smallest number " + arr[0]);

    }
}
