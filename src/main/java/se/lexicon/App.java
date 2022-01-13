package se.lexicon;

import se.lexicon.model.*;
import se.lexicon.service.VendingMachine;
import se.lexicon.service.VendingMachineImpl;


public class App 
{
    static VendingMachine vendingMachine;


    private static void initialize() {
        Beverage cola = new Beverage(99, "Coca Cola", 20.00, false, 40);
        Beverage colaZero = new Beverage(100, "Coca Cola Zero", 20.00, false, 0);
        Beverage coffee = new Beverage(1, "Black Coffee", 10.00, false, 0);
        Beverage beer = new Beverage(5, "Simple beer", 35.00, true, 10);

        Fruit bananaGreen = new Fruit(50, "Banana", 5.00, "Green");
        Fruit bananaY = new Fruit(51, "Banana", 5.00, "Yellow");
        Fruit bananaB = new Fruit(52, "Banana", 5.00, "Brown");

        Snack mars = new Snack(10, "mars bar", 15.00);
        Snack snickers = new Snack(11, "snickers bar", 15.00);

        //Init products
        Product[] products = {cola, colaZero, coffee, beer, bananaGreen, bananaY, bananaB, mars, snickers};
        vendingMachine = new VendingMachineImpl(products);
    }

    public static void main(String[] args )
    {
        initialize();

        System.out.println("--- Inspect all the products ---");
        String[] productsInVM = vendingMachine.getProducts();
        for (String string : productsInVM) {
            System.out.println(string);
        }

        System.out.println("\n--- Inspect a specific product --- ");
        String coffeeInfo = vendingMachine.getDescription(1);
        System.out.println("coffeeInfo = " + coffeeInfo);

        System.out.println("\n--- Add "+ SWEDISH_DENOMINATION.SEK_500.getVALUE() +" to the Machine ---");
        vendingMachine.addCurrency(SWEDISH_DENOMINATION.SEK_500);
        System.out.println("Balance: " + vendingMachine.getBalance());

        System.out.println("\n--- Request to Buy a product ---");
        System.out.println(vendingMachine.getDescription(1));
        System.out.println("Balance: " + vendingMachine.getBalance());
        Product myCoffee = vendingMachine.request(1);
        System.out.println("Balance: " + vendingMachine.getBalance());
        System.out.println(myCoffee.use());

        System.out.println("\n--- End Session = Return Money ---");
        double returnMoney = vendingMachine.endSession();
        System.out.println("returnMoney = " + returnMoney);
        System.out.println("Balance: " + vendingMachine.getBalance());

    }
}
