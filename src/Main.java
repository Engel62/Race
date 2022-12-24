import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;


public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4);

        Bus ikarus = new Bus("Икарус", "Пассажисркий", 4.25);
        Bus liaz = new Bus("ЛиАЗ-677", "Пассажисркий", 3.50);
        Bus gza = new Bus("ГЗА-651 ", "Пассажисркий", 5);
        Bus paz = new Bus("Паз", "3205",4);

        Truck volvo = new Truck("Volvo", "Wild Viking", 16.4);
        Truck scania = new Truck("Scania", " R730", 16.4);
        Truck maz = new Truck("Маз", "Generation 4", 13);
        Truck kamaz = new Truck("Камаз", "43509", 16.2);
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

        DriverD<Bus> anton = new DriverD<Bus>("Антон Петрович Васечкин", true, 8);
        anton.drive(ikarus);
        DriverC<Truck> petr = new DriverC<Truck>("Петр Васильевич Петров",true,10);
        petr.drive(kamaz);
        DriverB<Car> ivan = new DriverB<Car>("Иван Спиридонович Плюшкин", true, 20);
        ivan.drive(lada);
    }
}


