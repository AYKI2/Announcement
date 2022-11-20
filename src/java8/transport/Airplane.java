package java8.transport;
import java.time.LocalDate;

public final class Airplane extends Car{
    public Airplane(){}

    public Airplane(String name, String image, double price, String description,double rating, String color, LocalDate yearOfIssue) {
        super(name, image, price, description, rating, color, yearOfIssue);
    }


}
