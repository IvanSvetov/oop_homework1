package transport;

public class DriverCatC extends Driver{

    public DriverCatC(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Category C driver" + getName() + "started the movement");
    }

    @Override
    public void finishMove() {
        System.out.println("Category C driver" + getName() + "finished the movement");
    }

    @Override
    public void refuel() {
        System.out.println("Category C driver" + getName() + "is refueling the car");

    }
}
