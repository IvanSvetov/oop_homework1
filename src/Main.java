import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7,"Yellow", 2015, "Russia", "MT", "hachback", "111", 5);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0,"Black", 2020, "Germany", "MT", "hachback", "112", 5);
        Car car3 = new Car("BMW", "Z8", 3.0,"Black", 2021, "Germany", "AT", "hachback", "113", 2);
        Car car4 = new Car("Kia", "Sportage 4 generation", 2.4,"Red", 2018, "South Korea","AT", "hachback", "113",5);
        Car car5 = new Car("Hyundai", "Avante", 1.6,"Orange", 2016, "Germany","MT", "sedan", "115", 4);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car1.isWinterTires();
        car2.isWinterTires();
        car1.setMonth(6);
        car1.isWinterTires();
    }
}