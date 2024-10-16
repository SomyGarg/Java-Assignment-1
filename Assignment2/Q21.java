/*Write a program that outputs the name of the capital of the country entered at the 
command line. The program should throw a “NoMatchFoundException” when it fails to 
print the capital of the country entered at the command line. */
public class Q21 {
    public static void main(String[] args) {
        String country = "India";  // Example country input

        try {
            String capital = getCapital(country);
            System.out.println("Capital: " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getCapital(String country) throws NoMatchFoundException {
        if (country.equalsIgnoreCase("India")) {
            return "New Delhi";
        } else if (country.equalsIgnoreCase("USA")) {
            return "Washington D.C.";
        } else if (country.equalsIgnoreCase("Germany")) {
            return "Berlin";
        } else {
            throw new NoMatchFoundException("No match found for the entered country.");
        }
    }
}
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}