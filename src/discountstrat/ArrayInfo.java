package discountstrat;

public class ArrayInfo {
    public static final Product[] products = new Product[2];
    public static final Customer[] customers = new Customer[2];

    static {
        products[0] = new Product("1001", "Cereal", 30.00);
        products[1] = new Product("1002", "Bread", 20.00);
        products[2] = new Product("1003", "Gummy Bears", 12.00);

        
        customers[0] = new Customer("Brown", "Andy", "01");
        customers[1] = new Customer("Lowe", "Jenny", "02");
    }
}
