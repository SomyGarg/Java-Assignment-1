import java.util.*;
//     Write a class, Commission, which has an instance variable, sales; an appropriate
// constructor; and a method, commission() that returns the commission.Now write a demo class 
// to test the Commission class by reading a sale from the user, using it to create a Commission 
// object after validating that the value is not negative. Finally, call the commission() method to 
// get and print the commission. If the sales are negative, your demo should print the message
// “Invalid Input”

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = 0;
        } else {
            this.sales = sales;
        }
    }

    public double calculateCommission() {
        return sales * 0.1;
    }
}

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales amount: ");
        double sales = sc.nextDouble();

        Commission commissionObj = new Commission(sales);
        if (sales >= 0) {
            System.out.println("Commission: " + commissionObj.calculateCommission());
        }
    }
}
