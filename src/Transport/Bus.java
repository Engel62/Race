package Transport;

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
    public String toString() {
        return super.toString();
    }
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость " + seatsCapacity.getSeatsCapacityLowerLimit() + " - " +
                    seatsCapacity.getSeatsCapacityUpperLimit() + " мест");
        }
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
