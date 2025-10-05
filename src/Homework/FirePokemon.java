package Homework;

public class FirePokemon extends Pokemon{

    private double height;
    private double weight;

    public FirePokemon(String name, String food, int level, int healthPoints, int experiencePoints, double height, double weight) {
        super(new String[]{"Vuurpokemon","Waterpokemon"},name, food, level, healthPoints, experiencePoints);
        this.height = height;
        this.weight = weight;
    }

    //methodes
    @Override
    public void speaks() {
        IO.println("We don't need no water, let the mother-ia burn");
    }

    @Override
    public void specialAttack() {
        pyroManiac();
    }

    public void pyroBall(){
        IO.println("Gaat naar Rammstein concert");
    }
    public void pyroManiac(){
        IO.println("Zet de boel in de fik");
    }


    //getters en setters
    public double getHeight() {
        return  height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
