package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String colour;
    private String maxSpeed;

    public Transport(String brand, String model, int year, String country, String colour, String maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.colour = colour == null || colour.isBlank() ? "default": colour;
        this.maxSpeed = maxSpeed == null || maxSpeed.isBlank() ? "default" : maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport brand = " + brand + ", model = " + model +
                ", year = " + year +
                ", country = '" + country +
                ", colour = " + colour +
                ", maxSpeed = " + maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

