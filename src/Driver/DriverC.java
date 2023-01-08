package Driver;

import Driver.Driver;
import Transport.Competing;
import Transport.Transport;

public class DriverC<T extends Transport & Competing> extends Driver {

    public DriverC() {
        super("", true, 0, "");
    }

    public DriverC(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience,"" );
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void drive(T transport) {
        System.out.println("Водитель: " + getFullName() + " управляет автомобилем: " + transport.getBrand() + " " +
                transport.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с водительскими правами категории C начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с водительскими правами категории C останавливается");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водитель с водительскими правами категории C заправляет транспортное средство");
    }
}