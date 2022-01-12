package se.lexicon.service;

import se.lexicon.model.Product;
import se.lexicon.model.SWEDISH_DENOMINATION;

public interface VendingMachine {

    void addCurrency(SWEDISH_DENOMINATION amount);
    double getBalance();
    Product request(int id);
    double endSession();
    String getDescription(int id);
    String[] getProducts();

}
