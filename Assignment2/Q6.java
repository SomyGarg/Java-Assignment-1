public class Q6 {
    // Write a Java program to show method overloading.

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        System.out.println("Sum of 2 numbers " + obj.add(10, 20));
        System.out.println("Sum of 3 numbers " + obj.add(10, 20, 30));
    }
}
