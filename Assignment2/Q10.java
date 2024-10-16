/* Write a program to create a class named Vehicle having protected instance variables 
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a 
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
individual private instance variables routeNumber in Bus and manufacturerName in Car 
and both of them having showData ( ) method showing all details of Bus and Car 
respectively with content of the super class’s showData ( ) method. */
public class Q10 {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS123", 80, "Red", "John Doe", "R12");
        Car car = new Car("CAR456", 120, "Blue", "Jane Doe", "Toyota");

        bus.showData();
        car.showData();
    }
}

class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    void showData() {
        super.showData();
        System.out.println("Bus RegnNumber: " + regnNumber + ", Speed: " + speed + ", Color: " + color + ", Owner: "
                + ownerName + ", Route: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    void showData() {
        super.showData();
        System.out.println("Car RegnNumber: " + regnNumber + ", Speed: " + speed + ", Color: " + color + ", Owner: "
                + ownerName + ", Manufacturer: " + manufacturerName);
    }
}
