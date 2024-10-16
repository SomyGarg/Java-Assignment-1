/*
 * Create a base class Distance which stores the distance between two locations in miles and 
a method travelTime(). The method prints the time taken to cover the distance when the 
// speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() 
so that it prints the time assuming the distance is in kilometers and the speed is 100 km 
per second. Demonstrate the working of the classe
 */
public class Q12 {
    public static void main(String[] args) {
        Distance dist = new Distance(120);
        DistanceMKS distMKS = new DistanceMKS(120);

        dist.travelTime();
        distMKS.travelTime();
    }
}

class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        System.out.println("Time taken (in hours): " + (miles / 60));
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double kilometers) {
        super(kilometers);
    }

    void travelTime() {
        System.out.println("Time taken (in hours): " + (miles / 100));
    }
}
