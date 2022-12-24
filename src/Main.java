import Transport.Bus;
import Transport.Car;


public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        Bus ikarus = new Bus("Икарус", "Пассажисркий", 1980, "СССР", "Красный", 90);
        Bus liaz = new Bus("ЛиАЗ-677", "Пассажисркий", 1967, "СССР", "Желтый", 70);
        Bus gza = new Bus("ГЗА-651 ", "Пассажисркий", 1950, "СССР", "Красный", 60);
        System.out.println(ikarus);
        System.out.println(liaz);
        System.out.println(gza);
    }


    private static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуск: " + car.getProductionYear() +
                        ", страна сборки " + car.getProductionCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getGears() +
                        ", тип кузова " + car.getTypeOfBody() +
                        ", рег. номер " + car.getRegNumber() +
                        ", количество мест " + car.getSeatsCount() +
                        ",   " + (car.isSummerTyers() ? "летняя" : "зимняя") + " резина"
        );
    }
}