package transport;

public class Bus extends Transport<DriverCatD>{

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverCatD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Bus " + getBrand() + "started the movement");
    }

    @Override
    public void finishMove() {
        System.out.println("Bus " + getBrand() + "finished the movement");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit-Stop for the bus");
    }

    @Override
    public void bestLapTime() {
        double lapTime = 24.52;
        System.out.println("Best bus lap time " + lapTime);
    }

    @Override
    public void maxSpeed() {
        double maxSpeed = 194;
        System.out.println("Max speed of the bus " + maxSpeed);
    }
}
