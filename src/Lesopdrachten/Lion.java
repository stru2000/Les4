package Lesopdrachten;

public class Lion extends WildAnimals {

    int amountOffspring;

    public Lion(String name, String gender, String enclosureName, String lastFedDay, String originCountry, int amountOffspring) {
        super(name, gender, enclosureName, lastFedDay, originCountry);
        this.amountOffspring = amountOffspring;
    }

    public void makeSound() { super.makeSound(); IO.println("Roar!"); }
}
