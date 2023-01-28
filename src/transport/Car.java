package transport;

public class Car extends Transport<DriverCatB>{
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverCatB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.setBodyType(bodyType);
    }
    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car " + super.toString() + " bodyType = " + bodyType;
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
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
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

    @Override
    public boolean passDiagnostics() throws TransportTypeExeption {
        return this.isDiagnosticsPassed();
    }
}
