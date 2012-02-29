package discountstrat;

public class Product {
    
    private String id;
    private String name;
    private double unitCost;
    private DiscountStrategy[] discounts = new DiscountStrategy[0];

    public Product() {
    }

    public Product(String id, String name, double unitCost) {
        this.id = id;
        this.name = name;
        this.unitCost = unitCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

}