package transport;

public class Car extends Transport<DriverCatB>{
    public Car(String brand, String model, double engineVolume, DriverCatB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Car " + getBrand() + "started the movement");
    }
    @Override
    public void finishMove() {
        System.out.println("Car " + getBrand() + "finished the movement");
    }
    @Override
    public void pitStop() {
        System.out.println("Pit-Stop for the car");
    }
    @Override
    public void bestLapTime() {
        double lapTime = 12.98;
        System.out.println("Best car lap time " + lapTime);
    }
    @Override
    public void maxSpeed() {
        double maxSpeed = 315;
        System.out.println("Max speed of the car " + maxSpeed);
    }
}
