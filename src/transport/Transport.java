package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private boolean diagnosticsPassed = true;
    private List<Mechanic> mechanicList;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mechanicList = mechanicList;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }
    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }
    protected static List<Mechanic> listOfMechanics = new ArrayList<>();
    public static void addMechanic(String name, String company) {
        listOfMechanics.add(new Mechanic(name, company));
    }
    public static void removeMechanic(String name, String company) {
        listOfMechanics.remove(new Mechanic(name, company));
    }
    public static void removeMechanic(Mechanic mechanic) {
        listOfMechanics.remove(mechanic);
    }
    @Override
    public String toString() {
        return "Transport brand = " + brand + ", model = " + model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public T getDriver() { return driver; }
    public void setDriver(T driver) { this.driver = driver; }
    public double getEngineVolume() { return engineVolume; }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <=0 ? engineVolume = 1.6 : engineVolume;
    }
    public abstract String repair();
    public boolean isDiagnosticsPassed() {
        return this.diagnosticsPassed;
    }
    public abstract void startMove();
    public abstract void finishMove();
    public abstract boolean passDiagnostics();

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanicList);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

