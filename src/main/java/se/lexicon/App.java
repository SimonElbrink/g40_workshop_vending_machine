package se.lexicon;

import se.lexicon.model.Beverage;
import se.lexicon.model.Fruit;
import se.lexicon.model.Product;
import se.lexicon.model.Snack;
import se.lexicon.service.VendingMachine;
import se.lexicon.service.VendingMachineImpl;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args )
    {

        Beverage cola = new Beverage(99, "Coca Cola", 20, false, 40);
        Beverage colaZero = new Beverage(100, "Coca Cola Zero", 20, false, 0);
        Beverage coffee = new Beverage(1, "Black Coffee", 10, false, 0);
        Beverage beer = new Beverage(5, "Simple beer", 35, true, 10);

        Fruit bananaGreen = new Fruit(50, "Banana", 5, "Green");
        Fruit bananaY = new Fruit(51, "Banana", 5, "Yellow");
        Fruit bananaB = new Fruit(52, "Banana", 5, "Brown");

        Snack mars = new Snack(10, 15, "mars bar");
        Snack snickers = new Snack(11, 15, "snickers bar");


        //Init products
        Product[] products = {cola, colaZero, coffee, beer, bananaGreen, bananaY, bananaB, mars, snickers};
        VendingMachine vendingMachine = new VendingMachineImpl(products);

        //Init vendingMachine
        String[] productsInVM = vendingMachine.getProducts();
        for (String string : productsInVM) {
            System.out.println(string);
            System.out.println("---");
        }




        String coffeeInfo = vendingMachine.getDescription(1);

        System.out.println("coffeeInfo = " + coffeeInfo);

        vendingMachine.addCurrency(500);

        System.out.println("Balance: " + vendingMachine.getBalance());

        System.out.println(vendingMachine.request(1).use());

        System.out.println("Balance: " + vendingMachine.getBalance());

        int returnMoney = vendingMachine.endSession();

        System.out.println("returnMoney = " + returnMoney);

        System.out.println("Balance: " + vendingMachine.getBalance());






    }
}
