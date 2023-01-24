package transport;

public class DriverCatD extends Driver{

    public DriverCatD(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Category D driver" + getName() + "started the movement");

    }

    @Override
    public void finishMove() {
        System.out.println("Category D driver" + getName() + "finished the movement");

    }

    @Override
    public void refuel() {
        System.out.println("Category D driver" + getName() + "is refueling the car");

    }
}
