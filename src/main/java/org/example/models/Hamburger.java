package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = "Default Meat";
    }

    public Hamburger() {

    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Hamburger:" + name + "Fiyatı:" + price);
        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
            System.out.println("Ek malzeme:" + this.addition1Name + "Fiyatı:" + this.addition1Price);
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
            System.out.println("Ek malzeme:" + this.addition2Name + "Fiyatı:" + this.addition2Price);
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
            System.out.println("Ek malzeme:" + this.addition3Name + "Fiyatı:" + this.addition3Price);
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;
            System.out.println("Ek malzeme:" + this.addition4Name + "Fiyatı:" + this.addition4Price);
        }
        System.out.println("Toplam fiyat:" + totalPrice);
        return totalPrice;
    }

}

    
