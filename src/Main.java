import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Mechanic> mechanicList = new ArrayList<>();
        List<Transport> transports = new ArrayList<>();


        mechanicList.add(new Mechanic("Paulo", "Formula"));
        mechanicList.add(new Mechanic("Dmitry", "FastCar"));
        mechanicList.add(new Mechanic("Paulo", "RasingCar"));

        transports.add(new Car("Ford", "GTI", 3.2, new DriverCatB("Paulo", true, 3), List.of(mechanicList.get(0))));
        transports.add(new Bus("Fabia", "Comfort", 5.3, new DriverCatD("Oleg", true, 4), List.of(mechanicList.get(1))));
        transports.add(new Truck("Scania", "Heavy", 6.2, new DriverCatC("Roman", true, 7), List.of(mechanicList.get(2))));

        Queue<Transport> queue = new LinkedList<>();

        queue.add(transports.get(0));
        queue.add(transports.get(1));
        queue.add(transports.get(2));

        Map<Transport, Mechanic> map = new HashMap<>();
        map.put(transports.get(0), mechanicList.get(0));
        map.put(transports.get(1), mechanicList.get(1));
        map.put(transports.get(2), mechanicList.get(2));

        for (Map.Entry<Transport, Mechanic> task : map.entrySet()) {
            System.out.println("key = " + task.getKey() + " value = " + task.getValue());
        }
//        System.out.println(transports);
//        System.out.println(mechanicList.get(0).fixing() + " " + transports.get(0).getBrand());
//        System.out.println(mechanicList.get(1).fixing() + " " + transports.get(1).getBrand());
//        System.out.println(mechanicList.get(2).fixing() + " " + transports.get(2).getBrand());
    }
}
