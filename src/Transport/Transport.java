package Transport;

import Mechanic.Mechanic;

import java.util.List;

public abstract class Transport {
    private final String brand;
    private  final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;


    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public static void startMove() {
        System.out.println("Начать движение");
    }

    public static void endMove() {
        System.out.println("Закончить движение");
    }
    public abstract void passDiagnostics();


    @Override
    public String toString() {
        return
                "Марка " + brand  +
                        ", модель " + model +
                        ", объем двигателя " + engineVolume ;
    }
    public static void performDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println("An error occurred");
                System.out.println(e.getMessage());
            }
        }
    }
    public abstract void getDiagnosisTransport() throws CantDiagnosisException;

    public abstract void addMechanicTeamRacing(List<Mechanic> mechanics);


    public abstract void doRegularService(List<Mechanic> mechanics);
}

