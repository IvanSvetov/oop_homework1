import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Mechanic> mechanicList = new ArrayList<>();
        List<Transport> transportList = new ArrayList<>();
        List<Driver> driverList = new ArrayList<>();

        mechanicList.add(new Mechanic("Paulo", "Formula"));
        mechanicList.add(new Mechanic("Dmitry", "FastCar"));
        mechanicList.add(new Mechanic("Paulo", "RasingCar"));


        DriverCatB driverCatB = new DriverCatB("Driver cat. B", true, 5);
        DriverCatD driverCatD = new DriverCatD("Driver cat. D", true, 7);
        DriverCatC driverCatC = new DriverCatC("Driver cat. C", true, 8);

        driverList.add(driverCatB);
        driverList.add(driverCatB);
        driverList.add(driverCatC);
        driverList.add(driverCatD);
        driverList.add(driverCatC);

        transportList.add(new Car("Ford", "GTI", 3.2, new DriverCatB("Paulo", true, 3)));
        transportList.add(new Bus("Fabia", "Comfort", 5.3, new DriverCatD("Oleg", true, 4)));
        transportList.add(new Truck("Scania", "Heavy", 6.2, new DriverCatC("Roman", true, 7)));

        Set<Driver> driverSet = new HashSet<>();

        for (Driver driver : driverList) {
            driverSet.add(driver);
        }

        Iterator<Driver> iterator = driverSet.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println(driver);
        }
    }
}
