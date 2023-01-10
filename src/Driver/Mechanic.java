package Driver;

import Transport.Transport;

public class Mechanic <T extends Transport> {
    private String name;
    private String company;
    private String carTypeWork;

    public Mechanic(String name, String company, String carTypeWork) {
        this.name = name;
        this.company = company;
        this.carTypeWork = carTypeWork;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getCarTypeWork() {
        return carTypeWork;
    }

    public void setCarTypeWork(String carTypeWork) {
        this.carTypeWork = carTypeWork;
    }

    public void performMaintenance() {
        System.out.println("Проводит тех.обслуживание");
    }

    public void repairCar() {
        System.out.println("Починить машину");
    }

}
