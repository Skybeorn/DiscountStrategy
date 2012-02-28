package discountstrat;

/**
 * This class represents a fake database.
 * 
 * @author jlombardo
 */
public class FakeDatabase {
    public static final Product[] products = new Product[3];
    public static final Customer[] customers = new Customer[2];

    static {
        products[0] = new Product("A100", "Packer's Superbowl 2011 Cap", 30.00);
        products[0].addDiscount(new XmasDiscount());

        products[1] = new Product("B321", "White T-Shirt Large", 20.00);
        products[1].addDiscount(new XmasDiscount());
        products[1].addDiscount(new QuantityDiscount());

        products[2] = new Product("C444", "Ball Point Pen, Black", 10.00);
        products[2].addDiscount(new NoDiscount());

        customers[0] = new Customer("Smith", "John", "1234");
        customers[1] = new Customer("Doe", "Jane", "4321");
    }
}
