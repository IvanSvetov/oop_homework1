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



//        Car car1 = new Car("Ferrari", "F12 Berlinetta", 6.3);
//        Car car2 = new Car("Pagani", "Huayra", 6.0);
//        Car car3 = new Car("Lamborghini ", "Aventador", 6.5);
//        Car car4 = new Car("McLaren ", "MP4-12C", 3.8);
//
//        Truck truck1 = new Truck("Volvo", "Wild Viking", 12.8);
//        Truck truck2 = new Truck("Scania", "Red Pearl R999", 15.6);
//        Truck truck3 = new Truck("Tata", "Prima Race Truck", 12.0);
//        Truck truck4 = new Truck("Freightliner", "Cascadia Banks Super-Turbo", 8.3);
//
//        Bus bus1 = new Bus("MAZ", "251", 10.5);
//        Bus bus2 = new Bus("Yutong", "zk6129h", 8.8);
//        Bus bus3 = new Bus("Ikarus", "386", 10.0);
//        Bus bus4 = new Bus("Kia", "Grandbird", 12.9);
//
//        DriverCatB driverCatB = new DriverCatB("Sebastian Vettel", true, 16);
//        DriverCatC driverCatC = new DriverCatC("Lewis Carl Davidson Hamilton", true, 13);
//        DriverCatD driverCatD = new DriverCatD(" Fernando Alonso", true, 23);