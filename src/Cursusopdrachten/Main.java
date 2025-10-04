package Cursusopdrachten;

import javax.xml.namespace.QName;

public class Main {

    public static void main() {
        Customer customer = new Customer("Robin","Strumane", new VisaCard(0));
        //customer.name = "Robin";
        //IO.println(customer.name );;
        Customer customer2 = new Customer("Sten","Strumane",new MasterCard(0));
        //customer2.name = "Sten";
        //IO.println(customer2.name);;

        customer.printName();
        customer.getCreditCard().pay(100);
        IO.println(customer.getCreditCard().getDebt());
        customer2.printName();
        customer2.getCreditCard().pay(100);
        IO.println(customer2.getCreditCard().getDebt());
    }

}
