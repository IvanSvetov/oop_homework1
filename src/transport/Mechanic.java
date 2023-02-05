package transport;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void service() {
        System.out.println(getName() + " from company " + getCompany() + " performs maintenance");
    }
    public String fixing() {
        return getName() + " from company " + getCompany() + " fixing a car";
    }

    @Override
    public String toString() {
        return "Mechanic " +
                name +
                ", company = " +
                company;
    }
}
