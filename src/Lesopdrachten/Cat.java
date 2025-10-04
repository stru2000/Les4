package Lesopdrachten;

public class Cat extends PetAnimals{
    Boolean isIndoor;

    public Cat(String name, String gender, String nameOwner, String favoriteFood, String species, Boolean isIndoor) {
        super(name, gender, nameOwner, favoriteFood, species);
        this.isIndoor = isIndoor;
    }
    public void makeSound() { super.makeSound(); IO.println("Miaaauw!"); }
}
