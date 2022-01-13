package se.lexicon.model;

public class Fruit extends Product{

    private String color;

    public Fruit(int id, String productName, double price, String color) {
        super(id, productName, price);
        this.color = color;
    }

    @Override
    public String examine() {
        return "[id: " + getId() + " fruit: " + color + " " + getProductName() + "]";
    }

    @Override
    public String use() {
        return"Peeling " + getProductName() + " and eat it. Jummy!";
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
