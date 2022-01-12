package se.lexicon.model;

public class Snack implements Product{

    private int id;
    private double price;
    private String snack;

    public Snack(int id, double price, String snack) {
        this.id = id;
        this.price = price;
        this.snack = snack;
    }

    @Override
    public String examine() {
        return "[ id: " + id + " snack: " + snack + "]";
    }

    @Override
    public String use() {
        return "You eat some " + snack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return snack;
    }

    public void setProductName(String snack) {
        this.snack = snack;
    }
}
