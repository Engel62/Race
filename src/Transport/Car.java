package Transport;
public class Car extends Transport implements Competing  {
    private BodyType bodyType;
    public void passDiagnostics() {
        System.out.println("Машина " + getBrand() + ", " + getModel() + " на диагностике");
    }

    public Car(String brand, String model, double engineVolume,BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String toString() {
        return super.toString();
    }
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
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