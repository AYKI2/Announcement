package java8.home;

import java8.announcement.Announcement;

public class Home extends Announcement {
    private String homeType;
    private int maxGuest;

    public Home(){}

    public Home(String name, String image, double price, String description, double rating, String homeType, int maxGuest) {
        super(name, image, price, description, rating);
        this.homeType = homeType;
        this.maxGuest = maxGuest;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    @Override
    public String toString() {
        return "Home:" +
                super.toString()+
                "\nhomeType = " + homeType +
                "\nmaxGuest = " + maxGuest+"\n";
    }
}
