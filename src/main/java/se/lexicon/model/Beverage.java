package se.lexicon.model;

public class Beverage implements Product {

    private int id;
    private String productName;
    private double price;
    private boolean alcoholic;
    private int sugarPercentage;

    public Beverage(int id, String productName, double price, boolean alcoholic, int sugarPercentage) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.alcoholic = alcoholic;
        this.sugarPercentage = sugarPercentage;
    }

    @Override
    public String examine() {
        return "[id: " + getId() + " beverage: " + getProductName() + " with " + sugarPercentage + "% sugar]";
    }

    @Override
    public String use() {
        String description = "You drink some " + productName;

        //Ternary Operator == small if statement
        //If alcoholic is true add text of "tipsy" otherwise don't add anthing.
        description += alcoholic ? " and feel a bit tipsy" : "";

        return description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;

    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public int getSugarPercentage() {
        return sugarPercentage;
    }

    public void setSugarPercentage(int sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }
}
