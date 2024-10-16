/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the 
temperature (in Celsius) given by the user passed through the command line is too hot or 
too cold.
If temperature > 35, throw exception “TooHot”.
If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit. */
public class Q23 {
    public static void main(String[] args) {
        int temperature = 36; // Example temperature

        try {
            if (temperature > 35) {
                throw new TooHotException("Too Hot!");
            } else if (temperature < 5) {
                throw new TooColdException("Too Cold!");
            } else {
                System.out.println("Normal");
                System.out.println("Fahrenheit: " + (temperature * 9 / 5 + 32));
            }
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}

class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}
