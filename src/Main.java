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

        try {
            System.out.println(transports.get(1).passDiagnostics());
        } catch (TransportTypeExeption transportTypeExeption) {
            System.out.println("Автобусы не должны проходить диагностику");
        }
        System.out.println("Проверка завершена");
    }
}
