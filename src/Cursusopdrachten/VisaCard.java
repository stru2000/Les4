package Cursusopdrachten;

public class VisaCard extends CreditCard{
    public VisaCard(int debt) {
        super(debt);
    }



    @Override
    public void pay(int amount){
        double discount = amount * 0.9;
        super.pay((int) discount);
    }
}
