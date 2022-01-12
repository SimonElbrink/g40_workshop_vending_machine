package se.lexicon.model;

//Contract for a product, if you want to create a product you need impl these methods.
public interface Product {

//    static final int NUMBER = 123;
//
//    default void foo(){
//
//        int numbers = 1928;
//
//        System.out.println(numbers);
//    }

    String examine();
    String use();
    int getId();
    String getProductName();
    void setProductName(String productName);
    double getPrice();
    void setPrice(double price);

}
