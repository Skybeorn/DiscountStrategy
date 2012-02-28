package discountstrat;

public class Customer {
    
    //Customer Fields
    private String lastName;
    private String firstName;
    private String accountNo;
    
    //Customer Constructor
    public Customer(String lastName, String firstName, String accountNo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountNo = accountNo;
    }
    
    //Getters and Setters
    public String getAccountId() {
        return accountNo;
    }

    public void setAccountId(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}