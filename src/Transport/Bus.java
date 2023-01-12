package Transport;

import Mechanic.Mechanic;

import java.util.List;

public class Bus extends Transport implements Competing {
    private SeatsCapacity seatsCapacity;


    public Bus(String brand, String model,  double engineVolume, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume);
        this.seatsCapacity = seatsCapacity;
    }
    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
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
        if (seatsCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость " + seatsCapacity.getSeatsCapacityLowerLimit() + " - " +
                    seatsCapacity.getSeatsCapacityUpperLimit() + " мест");
        }
    }


    public void getStart() {

    }


    public void getStop() {

    }

    @Override
    public String toString() {
        return null;
    }

    public void passDiagnostics() {
        throw new UnsupportedOperationException("Автобус " + getBrand() + ", " + getModel() + " не может пройти диагностику");
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
