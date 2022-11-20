package java8.device;
import java8.announcement.Announcement;

public class Laptop extends Announcement {
    private String operatingSystem;

    public Laptop(String name, String image, double price, String description, double rating, String operatingSystem) {
        super(name, image, price, description, rating);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop:" +
                super.toString()+
                "\noperatingSystem = " + operatingSystem+"\n";
    }
}
