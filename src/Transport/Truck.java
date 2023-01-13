package Transport;
import Mechanic.Mechanic;
import java.util.List;
import Mechanic.VehicleRepairSpecification;

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
    public void getDiagnosisTransport() throws CantDiagnosisException {

    }


    public Truck(String brand , String model , double engineVolume , List<Mechanic> mechanic , LoadCapacity loadCapacity) {
        super ( brand , model , engineVolume , mechanic );
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand , String model , double engineVolume , List<Mechanic> mechanic , List<Transport> transports , LoadCapacity loadCapacity) {
        super ( brand , model , engineVolume , mechanic , transports );
        this.loadCapacity = loadCapacity;
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


    @Override
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println ( "Грузовик " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume () );
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK || value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
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


    @Override
    public void getStart() {

    }

    @Override
    public void getStop() {

    }

    @Override
    public String toString() {
        return null;
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

