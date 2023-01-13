package Transport;
import Mechanic.Mechanic;
import java.util.List;
import Mechanic.VehicleRepairSpecification;
public class Car extends Transport implements Competing  {
    private final BodyType bodyType;


    public Car(String brand , String model , double engineVolume , BodyType bodyType) {
        super ( brand , model , engineVolume );
        this.bodyType = bodyType;
    }

    public Car(String brand , String model , double engineVolume , List<Mechanic> mechanic , BodyType bodyType) {
        super ( brand , model , engineVolume , mechanic );
        this.bodyType = bodyType;

    }

    public Car(String brand , String model , double engineVolume , List<Mechanic> mechanic , List<Transport> transports , BodyType bodyType) {
        super ( brand , model , engineVolume , mechanic , transports );
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println ( "Данных по транспортному средству недостаточно" );
        } else {
            System.out.println ( bodyType );
        }
    }


    @Override
    public boolean equals(Object o) {
        return super.equals ( o );
    }

    @Override
    public int hashCode() {
        return super.hashCode ();
    }



    public void goPitStop(boolean OutOrIn) {
        if (OutOrIn) {
            System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " заезжает на Пит Стоп!" );
        } else {
            System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " покинул Пит Стоп!" );
        }
    }


    public void getBestTimeRound(double time) {
        System.out.println ( "Лучшее время круга у автомобиля " + getBrand () + " " + getModel () + " " + time + " минут" );

    }


    public void getMaximalSpeedTransport(int speed) {
        System.out.println ( "Максимальная скорость у автомобиля " + getBrand () + " " + getModel () + " " + speed + " км/ч" );
    }

    @Override
    public void getStart() {
        System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " стартует" );
    }

    @Override
    public void getStop() {
        System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " останавливается" );
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume ();
    }

    @Override
    public void getDiagnosisTransport() {
        System.out.println ( "Проводим диагностику автомобиля " + getBrand () + " " + getModel () );
    }


    @Override
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume () );
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR || value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println ( "- обслуживает " + value );
            }
        }
    }

    @Override
    public void doRegularService(List<Mechanic> mechanics) {
        System.out.println ( "Механики :" );
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR|| value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println ( "- " + value );
            }
        }
        System.out.println ( "производят регулярное ТО на автомобиле " + getBrand () + " " + getModel () );


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