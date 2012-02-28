/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrat;

/**
 *
 * @author Instlogin
 */
public class QuantityDiscount implements DiscountStrategy {
    private double baseRate = 0.10;
    private double price;
    private double qty;
    private double min = 5;

    public double getDiscount() {
        double discount = 0;

        if(qty >= getMin()) {
            discount = baseRate * price * qty;
        }
        return discount;
    }

    public double getRate() {
        return baseRate;
    }

    public void setRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuanitiy() {
        return qty;
    }

    public void setQuanitiy(double qty) {
        this.qty = qty;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }



    public String toString() {
        return "Quantity Discount";
    }
}