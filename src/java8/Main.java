package java8;

import java8.announcement.Announcement;
import java8.device.Laptop;
import java8.device.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {

        Phone phone1 = new Phone("Iphone","\uD83D\uDE0E",147000,"Amazing phone",5,"14 PRO Max",256);
        Phone phone2 = new Phone("Samsung","\uD83E\uDD29",58000,"Great phone",4.5,"S21",128);

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D",129000,"Wonderful laptop",5,"Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16",176000,"Productive laptop",4,"Windows");

        Home home1 = new Home("Ihlas","\uD83C\uDFE2",3500000,"Great Home",5,"Multi-storey",10);
        Home home2 = new Home("Chaos","\uD83C\uDFE0",15000000,"Amazing Home",3.5,"House",25);

        Car car1 = new Car("Mercedes-Benz","\uD83D\uDE98",15000000,"Wonderful Car",5,"Black", LocalDate.of(2010,3,6));
        Car car2 = new Car("BMW","\uD83D\uDE99",12000000,"Fast Car",3,"Purple", LocalDate.of(2020,8,28));

        Airplane airplane1 = new Airplane("Supermarine Spitfire","\uD83D\uDEE9",125000000,"Fast Airplane",3.5,"White", LocalDate.of(2015,1,14));
        Airplane airplane2 = new Airplane("Airbus A320","✈️",23000000,"Large Airplane",2,"Blue", LocalDate.of(2004,11,16));

        Helicopter helicopter1 = new Helicopter("MD 500 Defender","\uD83D\uDE81",13500000,"Fast Helicopter",2.5,"Brown",LocalDate.of(2012,12,23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache","\uD83D\uDE81",115000000,"Large Helicopter",4,"Red",LocalDate.of(1999,7,9));

        Announcement[] announcements = {phone1,phone2,laptop1,laptop2,home1,home2,car1,car2,airplane1,airplane2,helicopter1,helicopter2};

        while (true) {
            System.out.println("\nChoice 1(Max. Price), 2(Find by price), 3(Find by Name), 4(Sort by rating), 5(Find by rating), 6(Find by category), 7(ShowAll)");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(maxPrice(phone1.getPrice(), phone2.getPrice()));
                    break;
                case 2:
                    findByPrice(input.nextDouble(), announcements);
                    break;
                case 3:
                    findByName(input.next(), announcements);
                    break;
                case 4:
                    sortRating(announcements);
                    break;
                case 5:
                    findByRating(input.nextDouble(),announcements);
                    break;
                case 6:
                    System.out.println("Enter category: ");
                    findAll(input.next(), announcements);
                    break;
                case 7:
                    showAll(announcements);
                    break;
                default:
                    System.out.println("No such number!");
                    break;
            }
        }

    }
    public static double maxPrice(double price1, double price2){
        return Math.max(price1, price2);
    }
    public static void findByPrice(double price, Announcement[] announcement) {
        for (Announcement announcement1 : announcement) {
            if (price >= announcement1.getPrice()) {
                System.out.println(announcement1);
            }
        }
    }

    public static void findByName(String name, Announcement[] announcement){
        for (Announcement announcement1 : announcement) {
            if (name.equals(announcement1.getName())) {
                System.out.println(announcement1);
            }
        }
    }
    public static void findAll(String name, Announcement[] announcement) {
        for (Announcement announcement1 : announcement) {
            switch (name) {
                case "Phone":
                    if (announcement1.getClass().equals(Phone.class)) {
                        System.out.println(announcement1);
                    }
                    break;
                case "Laptop":
                    if (announcement1.getClass().equals(Laptop.class)) {
                        System.out.println(announcement1);
                    }
                    break;
                case "Home":
                    if (announcement1.getClass().equals(Home.class)) {
                        System.out.println(announcement1);
                    }
                    break;
                case "Car":
                    if (announcement1.getClass().equals(Car.class)) {
                        System.out.println(announcement1);
                    }
                    break;
                case "Airplane":
                    if (announcement1.getClass().equals(Airplane.class)) {
                        System.out.println(announcement1);
                    }
                    break;
                case "Helicopter":
                    if (announcement1.getClass().equals(Helicopter.class)) {
                        System.out.println(announcement1);
                    }
                    break;
                default:
                    System.out.println("No such category!");
                    break;
            }
        }
    }
    public static void sortRating(Announcement[] announcement){
        Announcement safe;
        for (int i = 0; i < announcement.length; i++) {
            for (int j = i+1; j < announcement.length; j++) {
                if (announcement[i].getRating() < announcement[j].getRating()) {
                    safe = announcement[i];
                    announcement[i] = announcement[j];
                    announcement[j] = safe;
                }
            }
            System.out.println(announcement[i]);
        }
    }

    public static void showAll(Announcement[] announcement){
        for (Announcement announcement1 : announcement) {
                System.out.println(announcement1);
        }
    }
    public static void findByRating(double rating, Announcement[] announcement){
        for (Announcement announcement1 : announcement) {
            if (rating == announcement1.getRating()) {
                System.out.println(announcement1);
            }
        }
    }


}
