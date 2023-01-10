package Driver;

public class Mechanic {
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
}
