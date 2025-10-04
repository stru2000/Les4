package Lesopdrachten;

public class Tiger extends WildAnimals {
    int amountStripes;

    public Tiger(String name, String gender, String enclosureName, String lastFedDay, String originCountry, int amountStripes) {
        super(name, gender, enclosureName, lastFedDay, originCountry);
        this.amountStripes = amountStripes;
    }

    public void makeSound() { super.makeSound(); IO.println("Grrrrrr!"); }
}
