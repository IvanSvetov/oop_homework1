package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String bodyType;
    private String carReg;
    private final int numberOfSeats;
    private boolean winterTires;
    private int month = 10;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String gearBox, String bodyType, String carReg, int numberOfSeats) {
        this.brand = brand == null ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = color == null || color.isBlank() ? "white" : color;
        this.year = year > 0 ? year : 2000;
        this.country = country == null || country.isBlank() ? "default" : country;
        this.gearBox = gearBox == null || gearBox.isBlank() ? "default" : gearBox;
        this.carReg = carReg == null || carReg.isBlank() ? "default" : carReg;
        this.bodyType = bodyType == null || bodyType.isBlank() ? "default" : bodyType;
        this.numberOfSeats = numberOfSeats <=0 ? 4 : numberOfSeats;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getGearBox() {
        return gearBox;
    }
    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getCarReg() {
        return carReg;
    }
    public void setCarReg(String carReg) {
        this.carReg = carReg;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public boolean getWinterTires() { return winterTires; }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", model = " + model + ", engineVolume=" + engineVolume +
                ", color = " + color + ", year = " + year + ", country = " + country + ", gearBox = " + gearBox +
                ", bodyType = " + bodyType + ", carReg = " + carReg + ", numberOfSeats = " + numberOfSeats;
    }
    public class Key {
        private final boolean remoteEngineStart = true;
        private final boolean keyLessAccess = true;
        Key key = new Key(remoteEngineStart, keyLessAccess);
        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
        }
    }
    public boolean isWinterTires() {
        if (month <= 4 || month >= 9) {
            System.out.println("Winter tires installed");
    }   else
            System.out.println("Summer tires installed");
        return winterTires;
    }

}
