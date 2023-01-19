package Driver;
import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driversLicence;
    private int drivingExperience;
    private String category;

    public Driver(String fullName, boolean driversLicence, int drivingExperience, String category) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Иванов Иван Иваныч";
        } else {
            this.fullName = fullName;
        }
        this.driversLicence = driversLicence;
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
        setCategory(category);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Иванов Иван Иваныч";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(boolean driversLicence) {
        this.driversLicence = driversLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", имеет ВУ: " + driversLicence +
                ", опыт вождения: " + drivingExperience + " лет.";
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        if (category == null || category.isEmpty()) {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительских прав " +
                        " для водителя " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительских прав " +
                        " для водителя " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicence == driver.driversLicence && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience);
    }

    //    public abstract void drive();
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelTheVehicle();
}