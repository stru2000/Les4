package Homework;

public class GrassPokemon extends Pokemon {
    boolean special;
    int accuracy;

    public GrassPokemon(String name, String food, int level, int healthPoints, int experiencePoints, boolean special, int accuracy) {
        super(new String[]{"Graspokemon"},name, food, level, healthPoints, experiencePoints);
        this.special = special;
        this.accuracy = accuracy;
    }

    //methodes

    @Override
    public void speaks() {
        IO.println("Don't step on the grass, Sam");
    }

    @Override
    public void specialAttack() {
        sprinkleGrass();
    }

    public void cutsGrass(){
        IO.println("Maait het gazon");
    }
    public void sprinkleGrass(){
        IO.println("Besproeit het gras op warme dagen");
    }


    //getters en setters

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
