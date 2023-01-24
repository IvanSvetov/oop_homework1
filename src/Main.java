import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverCatB driverCatB = new DriverCatB(
                    "Driver cat. B № " + i,
                    true,
                    5 + i);
            Car car = new Car(
                    "Car brand № " + i,
                    "Car model " + i,
                    1.6,
                    driverCatB);
            DriverCatC driverCatC = new DriverCatC(
                    "Driver cat. C № " + i,
                    true,
                    7 + i);
            Truck truck = new Truck(
                    "Truck brand № " + i,
                    "Track model № " + i,
                    4.5,
                    driverCatC);
            DriverCatD driverCatD = new DriverCatD(
                    "Driver cat. D № " + i,
                    true,
                    10 + i);
            Bus bus = new Bus(
                    "Bus brand № " + i,
                    "Bus model № " + i,
                    4.8,
                    driverCatD);
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }
    }
    private static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " is driving " + transport.getBrand() + " and will participate in the race");
    }
}