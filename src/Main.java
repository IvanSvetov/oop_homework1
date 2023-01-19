import transport.Bus;
import transport.Car;
import transport.Transport;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7,"Yellow", 2015, "Russia", "95", "MT", "hachback", "115", 4);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany", "250", "ATT", "sedan", "158", 4);
        Car car3 = new Car("BMW", "Z8", 3.0,"Black", 2021, "Germany", "210", "ATT", "sedan", "482", 5);
        Car car4 = new Car("Kia", "Sportage 4 generation", 2.4,"Red", 2018, "South Korea","150", "MT", "hachback","825", 5);
        Car car5 = new Car("Hyundai", "Avante", 1.6,"Orange", 2016, "Korea","130", "MT", "sedan", "287", 5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car1.isWinterTires();
        car2.isWinterTires();
        car1.setMonth(7);
        car1.isWinterTires();

        Bus bus1 = new Bus("Scania", "Touring", 2010, "Sweden", "White", "120");
        Bus bus2 = new Bus("MAN", "Lion's Coach", 2013, "Germany", "Black", "135");
        Bus bus3 = new Bus("Лиаз", "4292", 2015, "Russia", "Grey", "105");

        System.out.println(bus1);

    }
}