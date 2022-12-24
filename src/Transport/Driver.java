package Transport;

public class Driver {
    private String fullName;
    private boolean presenceOfADriverLicense;
    private int experience;

    public String getFullName() {
        return fullName;
    }

    public boolean isPresenceOfADriverLicense() {
        return presenceOfADriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, boolean presenceOfADriverLicense, int experience) {
        this.fullName = fullName;
        this.presenceOfADriverLicense = presenceOfADriverLicense;
        this.experience = experience;


    }
}
