package Transport;
import Mechanic.Mechanic;
import java.util.List;
import Mechanic.VehicleRepairSpecification;

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
    public Bus(String brand , String model , double engineVolume , List<Mechanic> mechanics , SeatsCapacity seatsCapacity) {
        super ( brand , model , engineVolume , mechanics );
        this.seatsCapacity = seatsCapacity;
    }

    public Bus(String brand , String model , double engineVolume , List<Mechanic> mechanics , List<Transport> transports , SeatsCapacity seatsCapacity) {
        super ( brand , model , engineVolume , mechanics , transports );
        this.seatsCapacity = seatsCapacity;
    }


    @Override
    public void getDiagnosisTransport() throws CantDiagnosisException {

    }

    @Override


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
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println ( "Автобус " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume () );
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_BUS || value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println ( "- обслуживает " + value );
            }
        }
    }


    @Override
    public void doRegularService(List<Mechanic> mechanics) {
        System.out.println ( "Механики :" );
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR || value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println ( "- " + value );
            }
        }
        System.out.println ( "производят регулярное ТО на автомобиле " + getBrand () + " " + getModel () );

    }


}
