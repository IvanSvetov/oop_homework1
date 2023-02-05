package transport;

import java.util.List;

public class Car extends Transport<DriverCatB>{
    public Car(String brand, String model, double engineVolume, DriverCatB driver, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
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

    @Override
    public boolean passDiagnostics() throws TransportTypeExeption {
        return this.isDiagnosticsPassed();
    }

    @Override
    public String repair() {
        return "Ремонтируем автомобиль";
    }
}
