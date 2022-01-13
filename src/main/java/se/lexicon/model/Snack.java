package se.lexicon.model;

public class Snack extends Product {

    public Snack(int id, String productName, double price) {
        super(id, productName, price);
    }

    @Override
    public String examine() {
        return "[ id: " + getId() + " snack: " + getProductName() + "]";
    }

    @Override
    public String use() {
        return "You eat some " + getProductName();
    }

}
