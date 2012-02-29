package discountstrat;

import discountstrat.CashRegister;

public class StartDemo {
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();

        cr.startNewSale("1234");
        cr.addNewLineItem("A100", 2);
        cr.addNewLineItem("B321", 9);
        cr.addNewLineItem("C444", 1);

        cr.displayInvoice();
        

    }
}