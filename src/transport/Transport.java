package transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private boolean diagnosticsPassed = true;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        setEngineVolume(engineVolume);
        setDriver(driver);
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
    public boolean isDiagnosticsPassed() {
        return this.diagnosticsPassed;

    }
    public abstract void startMove();
    public abstract void finishMove();
    public abstract boolean passDiagnostics();
}

