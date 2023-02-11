package transport;

public class Truck extends Transport<DriverCatC> {
    private Carrying carrying;


    public Truck(String brand, String model, double engineVolume, DriverCatC driver) {
        super(brand, model, engineVolume, driver);
        this.carrying = carrying;
    }

    public Carrying getCarrying() {
        return carrying;
    }

    public void setCarrying(Carrying carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Truck " + super.toString() + " carrying = " + carrying;
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
    public void printType() {
        if (getCarrying() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCarrying());
        }
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
        return true;
    }

    @Override
    public String repair() {
        return "Ремонтируем грузовик";
    }
}
