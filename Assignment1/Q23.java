public class Q23 {
    /*
     * Write Java programs for the patterns given bellow:
     * (a) 1
     * 2 3 4
     * 5 6 7 8 9
     * (b) 1
     * 2 1 2
     * 3 2 1 2 3
     * 4 3 2 1 2 3 4
     */

    // (A)
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
