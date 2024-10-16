/*Write program, which finds the sum of numbers formed by consecutive digits.
Input : 2415
output : 24+41+15=80. */
public class Q17 {
    public static void main(String[] args) {
        int num = 2415;
        String str = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int consecutiveNum = Integer.parseInt(str.substring(i, i + 2));
            sum += consecutiveNum;
        }

        System.out.println("Sum: " + sum);
    }
}
