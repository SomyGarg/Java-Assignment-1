import java.util.*;
/*
 * Write a program to define a class Employee to accept emp_id, emp _name, basic_salary 
from the user and display the gross_salary
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter emp_id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter emp_name: ");
        String name = sc.nextLine();
        System.out.print("Enter basic_salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.displayGrossSalary();
    }
}

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    Employee(int id, String name, double salary) {
        emp_id = id;
        emp_name = name;
        basic_salary = salary;
    }

    void displayGrossSalary() {
        double gross_salary = basic_salary + (basic_salary * 0.2) + (basic_salary * 0.1);
        System.out.println("Gross Salary: " + gross_salary);
    }
}