package Cursusopdrachten;

public class Customer {

    protected String name;
    String lastName;
    int customerNumber;
    private CreditCard creditCard;

    public Customer(String name, String lastName, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public Customer(String name, String lastName, int customerNumber, CreditCard creditCard) {
        this.customerNumber = customerNumber;
        this.lastName = lastName;
        this.name = name;
        this.creditCard = creditCard;
    }

    public void printName(){
        IO.println("Customer " + name);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
