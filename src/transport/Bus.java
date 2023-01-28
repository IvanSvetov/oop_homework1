package transport;

public class Bus extends Transport<DriverCatD>{
    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverCatD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus " + super.toString() + " capacity = " + capacity;
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
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
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

    @Override
    public boolean passDiagnostics() throws TransportTypeExeption {
        throw new TransportTypeExeption ("Автобусы диагностику проходить не должны");
    }
}
