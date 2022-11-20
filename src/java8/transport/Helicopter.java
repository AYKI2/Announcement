package java8.transport;
import java.time.LocalDate;

public class Helicopter extends Car{
    public Helicopter(){}

    public Helicopter(String name, String image, double price, String description,double rating, String color, LocalDate yearOfIssue) {
        super(name, image, price, description,rating, color, yearOfIssue);
    }

}
