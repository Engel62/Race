package Transport;

import Mechanic.Mechanic;

import java.util.List;

public class Truck extends Transport implements Competing {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void getDiagnosisTransport() throws CantDiagnosisException {

    }

    @Override
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {

    }

    @Override
    public void doRegularService(List<Mechanic> mechanics) {

    }

    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : " от " +
                    loadCapacity.getLoadCapacityLowerLimit() + " тонн";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " от " +
                    loadCapacity.getLoadCapacityUpperLimit() + " тонн";
            System.out.println("Load capacity: " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }
    }
    public void passDiagnostics() {
        System.out.println("Грузовик " + getBrand() + ", " + getModel() + " проходит диагностику");
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaximumSpeed() {

    }

}

