// Admission to a professional course is subject to the following conditions:
// (a) marks in Mathematics >= 60
// (b) marks in Physics >=50
// (c) marks in Chemistry >=40
// (d) Total in all 3 subjects >=200
// (Or) Total in Maths & Physics>=150 Given the marks in the 3 subjects of n (user input)
// students, write a program to processthe applications to list the eligible candidates.
public class Q12 {
    public static void main(String[] args) {
        int math = 65, physics = 55, chemistry = 45;
        int total = math + physics + chemistry;
        if (math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) {
            System.out.println("Eligible");
        } else if (math + physics >= 150) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
