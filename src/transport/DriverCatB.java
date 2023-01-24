package transport;

public class DriverCatB extends Driver{

    public DriverCatB(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Category B driver" + getName() + "started the movement");
    }

    @Override
    public void finishMove() {
        System.out.println("Category B driver" + getName() + "finished the movement");
    }

    @Override
    public void refuel() {
        System.out.println("Category B driver" + getName() + "is refueling the car");
    }
}
