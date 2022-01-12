package se.lexicon.model;

public class Fruit implements Product{

    private int id;
    private String fruitType;
    private double price;
    private String color;

    public Fruit(int id, String fruitType, double price, String color) {
        this.id = id;
        this.fruitType = fruitType;
        this.price = price;
        this.color = color;
    }

    @Override
    public String examine() {
        return "[id: " + getId() + " fruit: " + color + " " + fruitType + "]";
    }

    @Override
    public String use() {
        return"Peeling " + fruitType + " and eat it. Jummy!";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return fruitType;
    }

    public void setProductName(String productName) {
        this.fruitType = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
