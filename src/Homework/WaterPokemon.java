package Homework;

public class WaterPokemon extends Pokemon{
    public int attack;
    public int defence;

    public WaterPokemon(String name, String food, int level, int healthPoints, int experiencePoints, int attack, int defence) {
        super(new String[]{"Waterpokemon"},name, food, level, healthPoints, experiencePoints);
        this.attack = attack;
        this.defence = defence;
    }

    //methodes
    @Override
    public void speaks() {
        IO.println("Cause nothin' lasts forever, even cold November rain");
    }

    @Override
    public void specialAttack() {
        hydroPump();
    }

    public void surf(){
        IO.println("Neemt surfplank en gaat naar de zee");
    }
    public void hydroPump(){
        IO.println("Zet de sluizen open");
    }



    //getters en setters
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
