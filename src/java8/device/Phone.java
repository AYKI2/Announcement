package java8.device;

import java8.announcement.Announcement;

public class Phone extends Announcement {
    private String product;
    private int memory;

    public Phone(String name, String image, double price, String description, double rating, String product, int memory) {
        super(name, image, price, description, rating);
        this.product = product;
        this.memory = memory;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone: " +
                super.toString()+
                "\nproduct = " + product+
                "\nmemory = " + memory+"\n";
    }
}
