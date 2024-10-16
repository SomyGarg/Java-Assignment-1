/*Write a program to demonstrate use of 'static' keyword.
 * 
 */
public class Q16 {
    public static void main(String[] args) {
        DemoStatic obj1 = new DemoStatic();
        DemoStatic obj2 = new DemoStatic();
        DemoStatic obj3 = new DemoStatic();

        DemoStatic.showCount();
    }
}

class DemoStatic {
    static int count = 0;

    DemoStatic() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }
}
