package Lesopdrachten;

public abstract class PetAnimals extends Animals {

    String nameOwner;
    String favoriteFood;
    String species;

    public PetAnimals(String name, String gender,String nameOwner, String favoriteFood, String species) {
        super(name, gender);
        this.nameOwner = nameOwner;
        this.favoriteFood = favoriteFood;
        this.species = species;
    }

}
