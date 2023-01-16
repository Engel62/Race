import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Mechanic.Mechanic;
import Transport.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Mechanic.VehicleRepairSpecification;



public class Main {
    public static void checkDiagnosis(Transport... transports) {
        for (Transport transport : transports)
            try {
                transport.getDiagnosisTransport ();
            } catch (CantDiagnosisException e) {
                System.out.println ( e.getMessage () );
            }
    }
    public static void main(String[] args) {
        List <Transport> transports = new ArrayList<>();
        Car lada = new Car("Lada", "Granta", 1.7, BodyType.BODY_TYPE_SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,  BodyType.BODY_TYPE_SEDAN);
        Car bmw = new Car("BMW", "Z8", 2,  BodyType.BODY_TYPE_SEDAN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, BodyType.BODY_TYPE_SEDAN);

        Bus ikarus = new Bus("Икарус", "Пассажисркий", 4.25, SeatsCapacity.SEATS_CAPACITY_SMALL);
        Bus liaz = new Bus("ЛиАЗ-677", "Пассажисркий", 3.50,SeatsCapacity.SEATS_CAPACITY_MEDIUM);
        Bus gza = new Bus("ГЗА-651 ", "Пассажисркий", 5,SeatsCapacity.SEATS_CAPACITY_LARGE);
        Bus paz = new Bus("Паз", "3205",4,SeatsCapacity.SEATS_CAPACITY_LARGE);

        Truck volvo = new Truck("Volvo", "Wild Viking", 16.4,LoadCapacity.LOAD_CAPACITY_N1);
        Truck scania = new Truck("Scania", " R730", 16.4,LoadCapacity.LOAD_CAPACITY_N1);
        Truck maz = new Truck("Маз", "Generation 4", 13,LoadCapacity.LOAD_CAPACITY_N3);
        Truck kamaz = new Truck("Камаз", "43509", 16.2,LoadCapacity.LOAD_CAPACITY_N2);

        transports.add(lada);
        transports.add(audi);
        transports.add(bmw);
        transports.add(kia);
        transports.add(ikarus);
        transports.add(liaz);
        transports.add(gza);
        transports.add(paz);
        transports.add(volvo);
        transports.add(scania);
        transports.add(maz);
        transports.add(kamaz);
        System.out.println(transports);


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(ikarus);
        System.out.println(liaz);
        System.out.println(gza);
        System.out.println(paz);
        System.out.println(volvo);
        System.out.println(scania);
        System.out.println(maz);
        System.out.println(kamaz);
        List<Driver> drivers = new ArrayList<>();

        DriverD<Bus> anton = new DriverD<Bus>("Антон Петрович Васечкин", true, 8);
        anton.drive(ikarus);
        DriverC<Truck> petr = new DriverC<Truck>("Петр Васильевич Петров",true,10);
        petr.drive(kamaz);
        DriverB<Car> ivan = new DriverB<Car>("Иван Спиридонович Плюшкин", true, 20);
        ivan.drive(lada);

        drivers.add(anton);
        drivers.add(petr);
        drivers.add(ivan);
        System.out.println(drivers);

        List <Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic ( "Иванов" , "Петров" , "Омега" , VehicleRepairSpecification.SPECIFICATION_CAR );
        Mechanic mechanic2 = new Mechanic ( "Петр" , "Кочетов" , "Авторитет" , VehicleRepairSpecification.SPECIFICATION_TRUCK );
        Mechanic mechanic3 = new Mechanic ( "Виталий" , "Шпак" , "Транс" , VehicleRepairSpecification.SPECIFICATION_BUS );
        Mechanic mechanic4 = new Mechanic ( "Евстрват" , "Евсеев" , "Сервис +" , VehicleRepairSpecification.SPECIFICATION_UNIVERSAL );
        Mechanic mechanic5 = new Mechanic ( "Кирилл" , "Титов" , "Гараж" , VehicleRepairSpecification.SPECIFICATION_UNIVERSAL );
       mechanics.add ( mechanic1 );
       mechanics.add ( mechanic2 );
       mechanics.add ( mechanic3 );
       mechanics.add ( mechanic4 );
       mechanics.add ( mechanic5 );
        mechanics.forEach ( System.out::println );

        Car car5 = new Car ( "Lada" , "Granta" , 1.7 , mechanics ,BodyType.BODY_TYPE_SEDAN);
        Car car6 = new Car ( "Audi" , "A8 50 L TDI quattro" , 3.0 , mechanics , BodyType.BODY_TYPE_STATION_WAGON );
        Car car7 = new Car ( "BMW" , "Z8" , 3.0 , mechanics , BodyType.BODY_TYPE_COUPE );
        Car car8 = new Car ( "KIA" , "Sportage" , 2.4 , mechanics , BodyType.BODY_TYPE_CROSSOVER );

        Bus bus5 = new Bus ( "Volvo" , "B12" , 12.5 , mechanics , SeatsCapacity.SEATS_CAPACITY_EXTREMELY_SMALL );
        Bus bus6 = new Bus ( "Golden Dragon" , "XML6127" , 10.5 , mechanics , SeatsCapacity.SEATS_CAPACITY_MEDIUM );
        Bus bus7 = new Bus ( "MAN" , "Lion's Coach" , 11.0 , mechanics , SeatsCapacity.SEATS_CAPACITY_LARGE );
        Bus bus8 = new Bus ( "Scania" , "Irizar" , 10.6 , mechanics , SeatsCapacity.SEATS_CAPACITY_EXTREMELY_SMALL );

        Truck truck5 = new Truck ( "Mercedes-Benz" , "Actros" , 12.8 , mechanics , LoadCapacity.LOAD_CAPACITY_N1 );
        Truck truck6 = new Truck ( "Freightliner" , "FLD" , 14.0 , mechanics , LoadCapacity.LOAD_CAPACITY_N2 );
        Truck truck7 = new Truck ( "Daf" , "XF" , 13.2 , mechanics , LoadCapacity.LOAD_CAPACITY_N3 );
        Truck truck8 = new Truck ( "Volvo" , "FH" , 12.8 , mechanics , LoadCapacity.LOAD_CAPACITY_N1 );

        List<Transport> transportList = new ArrayList<> ();
        transportList.add ( car5 );
        transportList.add ( car6 );
        transportList.add ( car7 );
        transportList.add ( car8 );
        transportList.add ( bus5 );
        transportList.add ( bus6 );
        transportList.add ( bus7 );
        transportList.add ( bus8 );
        transportList.add ( truck5 );
        transportList.add ( truck6 );
        transportList.add ( truck7 );
        transportList.add ( truck8 );
        transportList.forEach ( System.out::println );


        List<Driver> driverList = new ArrayList<> ();
        driverList.add ( anton );
        driverList.add ( petr );
        driverList.add ( ivan );
        driverList.forEach ( System.out::println );


        car8.addMechanicTeamRacing ( mechanics );
        bus7.addMechanicTeamRacing ( mechanics );
        truck7.addMechanicTeamRacing ( mechanics );

        car8.doRegularService ( mechanics );
        bus7.doRegularService ( mechanics );
        truck6.doRegularService ( mechanics );

        Map <Transport, Mechanic> avtoRace  = new HashMap<>();
        avtoRace.put(car5, mechanic1);
        avtoRace.put(truck5, mechanic2);
        avtoRace.put(bus5, mechanic3);
        avtoRace.put(bus5, mechanic3);
        System.out.print(avtoRace);









    }
}

