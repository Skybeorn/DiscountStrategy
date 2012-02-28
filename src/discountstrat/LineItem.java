package discountstrat;


public class LineItem {
    
    //Fields For a LineItem, A line item is a product, and that lineItem
    //has a QTY  of that product.
    private Product product;
    private double qty;
    
    //Constructor for the LineItem
    public LineItem(String productId, double qty) {
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
        //Logic not determined yet
        return product;
    }
}
