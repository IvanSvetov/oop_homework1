import transport.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", "F12 Berlinetta", 6.3, new DriverCatB("Leonardo", true, 5));
        System.out.println(car.passDiagnostics());
        Truck truck = new Truck("Truck brand", "Truck model", 5.0, new DriverCatC("Alex", true, 7));
        System.out.println(truck.passDiagnostics());
        Bus bus = new Bus("Bus brand", "Bus model", 4.5, new DriverCatD("Fernando", true, 6));

        printInfo(car);
        printInfo(truck);
        printInfo(bus);
        System.out.println(bus.passDiagnostics());
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " is driving " + transport.getBrand() + " and will participate in the race");
    }
}
