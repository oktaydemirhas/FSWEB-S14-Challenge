package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.10, "Standart Ekmek");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}
