package discountstrat;


public class LineItem {
    
    //Fields For a LineItem, A line item is a product, and that lineItem
    //has a QTY  of that product.
    private Product product;
    private double qty;
    
    //Constructor for the LineItem
    public LineItem(String prodId, double qty) {
        this.product = findProduct(prodId);
        this.qty = qty;
    }

    //Getters and Setters
    public double getTotalDiscount() {
        return product.getTotalDiscount(qty);
    }

    public double getLineItemTotal() {
        return product.getUnitCost() * qty - getTotalDiscount();
    }

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
        return product;
    }
}
