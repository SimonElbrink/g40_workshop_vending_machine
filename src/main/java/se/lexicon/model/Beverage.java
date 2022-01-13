package se.lexicon.model;

public class Beverage extends Product {

    private boolean alcoholic;
    private int sugarPercentage;

    public Beverage(int id, String productName, double price, boolean alcoholic, int sugarPercentage) {
        super(id, productName, price);
        this.alcoholic = alcoholic;
        this.sugarPercentage = sugarPercentage;
    }

    @Override
    public String examine() {
        return "[id: " + getId() + " beverage: " + getProductName() + " with " + sugarPercentage + "% sugar]";
    }

    @Override
    public String use() {
        String description = "You drink some " + getProductName();

        //Ternary Operator == small if statement
        //If alcoholic is true add text of "tipsy" otherwise don't add anthing.
        description += alcoholic ? " and feel a bit tipsy" : "";

        return description;
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
