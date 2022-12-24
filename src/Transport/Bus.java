package Transport;

public class Bus extends Transport implements Competing {


    public Bus(String brand, String model,  double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {

    }

    @Override
    public String[] bestLapTime() {
        return new String[0];
    }

    @Override
    public String[] maxSpeed() {
        return new String[0];
    }
}
