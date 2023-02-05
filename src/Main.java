import transport.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Mechanic> mechanicList = new ArrayList<>();
        List<Transport> transports = new ArrayList<>();


        mechanicList.add(new Mechanic("Paulo", "Formula"));
        mechanicList.add(new Mechanic("Dmitry", "FastCar"));
        mechanicList.add(new Mechanic("Paulo", "RasingCar"));

        transports.add(new Car("Ford", "GTI", 3.2, new DriverCatB("Paulo", true, 3)));
        transports.add(new Bus("Fabia", "Comfort", 5.3, new DriverCatD("Oleg", true, 4)));
        transports.add(new Truck("Scania", "Heavy", 6.2, new DriverCatC("Roman", true, 7)));

        Queue<Transport> queue = new LinkedList<>();

        queue.add(transports.get(0));
        queue.add(transports.get(1));
        queue.add(transports.get(2));

        System.out.println(transports);
        System.out.println(mechanicList.get(0).fixing() + " " + transports.get(0).getBrand());
        System.out.println(mechanicList.get(1).fixing() + " " + transports.get(1).getBrand());
        System.out.println(mechanicList.get(2).fixing() + " " + transports.get(2).getBrand());

    }
}
