/*
 * . Write a program to demonstrate use of 'this' keyword.
 */
public class Q15 {
    public static void main(String[] args) {
        DemoThis obj = new DemoThis(10);
        obj.show();
    }
}

class DemoThis {
    int num;

    DemoThis(int num) {
        this.num = num;
    }

    void show() {
        System.out.println("Number: " + this.num);
    }
}
