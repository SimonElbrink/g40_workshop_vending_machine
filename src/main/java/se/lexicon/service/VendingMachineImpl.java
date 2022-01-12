package se.lexicon.service;

import se.lexicon.model.Product;
import se.lexicon.model.SWEDISH_DENOMINATION;


public class VendingMachineImpl implements VendingMachine{

    private Product[] products;
    private double depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(SWEDISH_DENOMINATION amount) {
        //If amount matching valid Denomination allow adding.
        boolean match = false;
        for (SWEDISH_DENOMINATION validDenomination : SWEDISH_DENOMINATION.values()) {
            if (validDenomination == amount){
                depositPool += amount.getVALUE();
                match = true;
            }
        }
        if (!match){
            throw new RuntimeException("Not a valid denomination: " + amount);
        }
    }

    @Override
    public double getBalance() {
        return depositPool;
    }

    //Buy product
    @Override
    public Product request(int id) {
        //if id exists continue
        //if depositPool have enough money. continue
        // if all is matching return product and make payment.
        for (Product product : products) {
            if (product.getId() == id){
                if ( product.getPrice() <= depositPool){
                    depositPool = (depositPool - product.getPrice());
                    return product;
                }else{
                    throw new IllegalArgumentException(product.getProductName() + "was to Expensive");
                }
            }

        }
        throw new IllegalArgumentException("Product With id: " + id + "Was not found");
    }

    @Override
    public double endSession() {
        double balanceToReturn = depositPool;
        depositPool = 0;
        return balanceToReturn;
    }

    //Get info of a specific item.
    @Override
    public String getDescription(int id) {
        String notFound = "Could not find product with id " + id;

        for (Product product : products) {
            if (product.getId() == id) {
                return product.examine().concat(" - Price: " + product.getPrice());
            }
        }

        return notFound;
    }

    //Get info about all available products.
    @Override
    public String[] getProducts() {
        String[] productsAsString = new String[products.length];

        for (int i = 0; i < products.length; i++) {
            productsAsString[i] = products[i].examine().concat( " - Price: " + products[i].getPrice());
        }

        return productsAsString;
    }
}
