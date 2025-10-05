package Homework;

public class ElectricPokemon extends Pokemon{

    double voltage;
    double resistance;

    public ElectricPokemon(String name, String food, int level, int healthPoints, int experiencePoints, double voltage, double resistance) {
        super(new String[]{"Electriciteitpokemon"}, name, food, level, healthPoints, experiencePoints);
        this.voltage = voltage;
        this.resistance = resistance;
    }

    //methodes

    @Override
    public void speaks() {
        IO.println("You 've been thunderstruck");
    }

    @Override
    public void specialAttack() {
        chargeBattery();
    }

    public void callTheElectrician(){
        IO.println("Bel over 3 maand eens terug...");
    }

    public void chargeBattery(){
        IO.println("Zoekt dichtsbijzijndste Tesla");
    }

    //getters en setters

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
