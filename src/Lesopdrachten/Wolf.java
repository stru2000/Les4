package Lesopdrachten;

public class Wolf extends WildAnimals {

    String namePack;

    public Wolf(String name, String gender, String enclosureName, String lastFedDay, String originCountry, String namePack) {
        super(name, gender, enclosureName, lastFedDay, originCountry);
        this.namePack = namePack;
    }
    public void makeSound() { super.makeSound(); IO.println("Awoooooh!"); }
}
