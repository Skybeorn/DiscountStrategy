package discountstrat;


public class LineItem {
    
    //Fields For a LineItem, A line item is a product, and that lineItem
    //has a QTY  of that product.
    private Product product;
    private double qty;
    private Product[] productDb;
    
    //Constructor for the LineItem
    public LineItem(String productId, double qty) {
        // To be removed in future when we switch to a database
        productDb = new Product[3];
        Product hat = new Product("A100", "Hat", 20.00);
        hat.setDiscountStrategy(new ZeroDiscount());
        productDb[0] = hat;
        
        Product belt = new Product("B100", "Belt", 30.00);
        belt.setDiscountStrategy(new QuantityDiscount());
        productDb[1] = belt;
        
        Product tie = new Product("C100", "Tie", 40.00);
        tie.setDiscountStrategy(new QuantityDiscount());
        productDb[2] = tie;

        this.product = findProduct(productId);
        this.qty = qty;        
    }

    //Getters and Setters

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    //FindProduct Method
    private Product findProduct(String productId) {
        Product prod = null;
        
        for(Product p : productDb) {
            if(productId.equals(p.getId())) {
                prod = p;
                break;
            }
        }
        
        return prod;
    }
    
    public double getSubtotal() {
        return (qty * product.getUnitCost() - product.getDiscountAmt(qty));
    }
    
    public double getSubtotalDiscounts() {
        return product.getDiscountAmt(qty);
    }
    
    public String getLineItemAsString() {
        double discountAmt = product.getDiscountAmt(qty);
        return product.getId() + "     " + product.getName()
                + "     " + qty + "     " + product.getUnitCost()
                + "     " + getSubtotalDiscounts() + "    "
                + getSubtotal();
    }
    
    public static void main(String[] args) {
        LineItem item = new LineItem("B100", 10);
        String data = item.getLineItemAsString();
        System.out.println(data);
    }
}
