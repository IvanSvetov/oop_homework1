package transport;

public class Truck extends Transport<DriverCatC> {

    public Truck(String brand, String model, double engineVolume, DriverCatC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Truck" + getBrand() + "started the movement");
    }

    @Override
    public void finishMove() {
        System.out.println("Truck" + getBrand() + "finished the movement");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit-Stop for the truck");
    }

    @Override
    public void bestLapTime() {
        double lapTime = 15.29;
        System.out.println("Best truck lap time " + lapTime);
    }

    @Override
    public void maxSpeed() {
        double maxSpeed = 257;
        System.out.println("Max speed of the truck " + maxSpeed);
    }

    @Override
    public boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }

    @Override
    public String repair() {
        return "Ремонтируем грузовик";
    }
}
