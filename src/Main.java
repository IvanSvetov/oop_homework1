import transport.*;

public class Main {
    public static void main(String[] args) {

        DriverCatB driverCatB = new DriverCatB("Driver cat. B", true, 5);
        DriverCatD driverCatD = new DriverCatD("Driver cat. D", true, 7);
        DriverCatC driverCatC = new DriverCatC("Driver cat. C", true, 8);
        Car car1 = new Car("car brand", "car model", 1.6, driverCatB, BodyType.TYPE1);
        Bus bus1 = new Bus("bus brand", "bus model", 5.0, driverCatD, Capacity.SMALL);
        Truck truck1 = new Truck("truck brand", "truck model", 4.0,driverCatC, Carrying.N1);
        System.out.println(car1);
        System.out.println(bus1);
        System.out.println(truck1);

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