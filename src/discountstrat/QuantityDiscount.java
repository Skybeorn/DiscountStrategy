
package discountstrat;


public class QuantityDiscount implements DiscountStrategy {
    private double baseRate = 0.10;
//    private double price;
//    private double qty;
//    double discount;
    private double minQty = 5;

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }    


//    @Override
//    public double getPrice() {
//        return price;
//    }
//    @Override
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    @Override
//    public double getQuanitiy() {
//        return qty;
//    }
//    @Override
//    public void setQuanitiy(double qty) {
//        this.qty = qty;
//    }

    @Override
    public double getDiscountAmt(double qty, double price) {
        double discount = 0;
        
        if(qty >= minQty) {
            discount = qty * price * baseRate;
        }
        
        return discount;
    }
    
    public static void main(String[] args) {
        DiscountStrategy ds = new QuantityDiscount();
        double discount = ds.getDiscountAmt(5, 10.00);
        double expected = 5;
        if(discount == expected) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed");
        }
    }
}