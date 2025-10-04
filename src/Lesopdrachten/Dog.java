package Lesopdrachten;

public class Dog extends PetAnimals{
    public Dog(String name, String gender, String nameOwner, String favoriteFood, String species) {
        super(name, gender, nameOwner, favoriteFood, species);
    }
    public void makeSound() { super.makeSound(); IO.println("Woef!"); }
}
