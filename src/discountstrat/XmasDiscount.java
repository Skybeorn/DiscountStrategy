/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrat;

/**
 *
 * @author Skybeorn
 */
public class XmasDiscount implements DiscountStrategy {
    
    double baseRate = .50;
    double minQty = 0;

    @Override
    public double getBaseRate() {
        return baseRate;
            }

    @Override
    public double getDiscountAmt(double qty, double price) {
        return qty * price * baseRate;
        }

    @Override
    public double getMinQty() {
        return minQty;
    }

    @Override
    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    @Override
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }
    
    public static void main(String[] args) {
        DiscountStrategy xmas = new XmasDiscount();
        double discount = xmas.getDiscountAmt(15, 10.00);
        
        if (discount == 74){
            System.out.println("Winner");
        }else{
            System.out.println("Fail");
        }
        
    }
    
}
