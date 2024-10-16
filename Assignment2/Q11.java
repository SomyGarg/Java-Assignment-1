/*    
 * Write a Java program which creates a base class Num and contains an integer number 
along with a method shownum() which displays the number. Now create a derived class 
HexNum which inherits Num and overrides shownum() which displays the hexadecimal 
value and octal value of the number. Demonstrate the working of the classes.
 */
public class Q11 {
    public static void main(String[] args) {
        Num num = new Num(42);
        HexNum hexNum = new HexNum(42);

        num.showNum();
        hexNum.showNum();
    }
}

class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
