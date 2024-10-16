public class Q3 {
    // Write a Java program to show parameterized constructor.

    int number;

    Q3(int num) {
        number = num;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3(10);
        System.out.println("Number = " + obj.number);
    }
}
