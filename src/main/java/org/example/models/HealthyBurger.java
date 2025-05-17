package org.example.models;

public class HealthyBurger extends Hamburger {
    private String meat;

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        this.meat = "Tofu";
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println(name + " eklendi, Fiyat: " + price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println(name + " eklendi, Fiyat: " + price);
    }

    @Override
    public String getMeat() {
        return this.meat;
    }

    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();
        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
        }
        return totalPrice;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.getPrice();

        System.out.println("Healthy Burger (" + this.meat + " etli, " + super.getBreadRollType() + " ekmekli) " + super.getName() + " Fiyat: " + String.format("%.2f", super.getPrice()));

        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
            System.out.println("Eklenen sağlıklı malzeme: " + this.healthyExtra1Name + ", Fiyatı: " + String.format("%.2f", this.healthyExtra1Price));
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
            System.out.println("Eklenen sağlıklı malzeme: " + this.healthyExtra2Name + ", Fiyatı: " + String.format("%.2f", this.healthyExtra2Price));
        }

        System.out.println("Healthy Burger Toplam Fiyat: " + String.format("%.2f", totalPrice));
        return totalPrice;
    }

}
