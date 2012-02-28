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
    double discount;

    
    
    //getters and Setters
    @Override
    public double getRate() {
        return baseRate;
    }
    @Override
    public void setRate(double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public double getQuanitiy() {
        return qty;
    }
    @Override
    public void setQuanitiy(double qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}