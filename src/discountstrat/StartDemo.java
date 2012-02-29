package discountstrat;

public class StartDemo {
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();

        cr.startNewSale("100");
        cr.addNewLineItem("A100", 2);
        cr.addNewLineItem("B100", 9);
        cr.addNewLineItem("C100", 1);

        cr.displayInvoice();
        

    }
}