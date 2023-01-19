package Driver;

import Driver.Driver;
import Transport.Competing;
import Transport.Transport;

public class DriverD<T extends Transport & Competing> extends Driver {

    public DriverD() {
        super("", true, 0,"");
    }

    public DriverD(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience, "");
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
        System.out.println("Водитель с водительскими правами категории Д начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с водительскими правами категории Д останавливается");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водитель с водительскими правами категории Д заправляет транспортное средство");
    }
}