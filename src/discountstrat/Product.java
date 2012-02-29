package discountstrat;

public class Product {
    
    private String id;
    private String name;
    private double unitCost;
    private DiscountStrategy discountStrategy;

    public Product(String id, String name, double unitCost) {
        this.id = id;
        this.name = name;
        this.unitCost = unitCost;
    }
    
    public double getDiscountAmt(double qty) {
        return discountStrategy.getDiscountAmt(qty, unitCost);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id == null || id.length() == 0) {
            System.out.println("error, wrong data");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    public static void main(String[] args) {
        Product hat = new Product("A100", "Hat", 20.00);
        DiscountStrategy strategy = new QuantityDiscount();
        strategy.setMinQty(2);
        hat.setDiscountStrategy(strategy);
        double discount = hat.getDiscountAmt(2);
        double expected = 4;
        
        if(discount == expected) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed");
        }
    }

}