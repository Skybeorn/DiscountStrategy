package discountstrat;


public class Invoice {

    //Cutomer object
    private Customer customer;
    private Customer[] customerDb;
    
    //Lineitem Object
    private LineItem[] lineItems = new LineItem[0];

    public Invoice(String customerActNo) {
        customerDb = new Customer[2];
        Customer cust1 = new Customer("Jones", "Bob", "100");
        Customer cust2 = new Customer("Smith", "Sally", "101");
        customerDb[0] = cust1;
        customerDb[1] = cust2;
        
        customer = this.findCustomer(customerActNo);
    }

    public void addLineItem(String productId, double qty) {
        LineItem item = new LineItem(productId, qty);
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = item;
        lineItems = temp;
    }
    
    public double getGrandTotalPayAmount() {
        double total = 0;
        for(LineItem item : lineItems) {
            total += item.getSubtotal();
            // total = total + item.getSubtotal();
        }
        return total;
    }
    
    public double getGrandTotalDiscount() {
        double total = 0;
        for(LineItem item : lineItems) {
            total += item.getSubtotalDiscounts();
            // total = total + item.getSubtotal();
        }
        return total;
    }
    
    public String getInvoiceDataAsString() {
        String data = customer.getAccountId() + "\n"
                + customer.getFirstName() + " " 
                + customer.getLastName() + "\n\n";
        
        data += "ID    Name                 Qty       Cost      Discount     Total\n";
        data += "=================================================================\n";
        
       for(LineItem item : lineItems) {
           data += item.getLineItemAsString() + "\n";
       }
       
       data += "\n ==================================\n";
       data += "Total Owned: " + getGrandTotalPayAmount() + "\n";
       data += "Total Saved: " + getGrandTotalDiscount();

       return data;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    private Customer findCustomer(String custId) {
        Customer cust = null;

        for (Customer c : customerDb) {
            if (custId.equals(c.getAccountId())) {
                cust = c;
                break;
            }
        }

        return cust;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("101");
        Customer customer = invoice.getCustomer();
        System.out.println(customer.getLastName());
        
        invoice.addLineItem("B100", 2);
        for(LineItem item : invoice.lineItems) {
            System.out.println(item.getLineItemAsString());
        }
    }
}