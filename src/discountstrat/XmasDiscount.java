/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrat;

/**
 *
 * @author Instlogin
 */
public class XmasDiscount implements DiscountStrategy {
    private double baseRate = 0.10;
    private double price;
    private double qty;
    private double min;
    private double baseAmount;

    public double getDiscount() {
        return baseRate * qty * getPrice();
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
        return "Xmas Discount";
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }
    

    public static void main(String[] args) {
        DiscountStrategy discount = new XmasDiscount();
        discount.setRate(.10);
        discount.setPrice(25.00);
        discount.setQuanitiy(20);
        
        double amt = discount.getDiscount();
        System.out.println("The discount is: " + amt);        
    }
    

}