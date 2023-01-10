import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List <Transport> transports = new ArrayList<>();
        Car lada = new Car("Lada", "Granta", 1.7, BodyType.BODY_TYPE_SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,BodyType.BODY_TYPE_SEDAN);
        Car bmw = new Car("BMW", "Z8", 2,BodyType.BODY_TYPE_SEDAN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4,BodyType.BODY_TYPE_SEDAN);

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




    }
}


