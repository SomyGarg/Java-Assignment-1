import java.util.Scanner;

// Write a Java program to implement stack using array.
public class Q25 {
    static int top = -1;
    static int[] stack;

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void push(int element) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = element;
            System.out.println(element);
        }
    }

    
    public static void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(stack[top--]);
        }
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        stack = new int[size];

        while (true) {
            System.out.println("Enter 1 to push, 2 to pop, 3 to display, 4 to exit: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter element to push: ");
                int element = sc.nextInt();
                push(element);
            } else if (choice == 2) {
                pop();
            } else if (choice == 3) {
                display();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

}
