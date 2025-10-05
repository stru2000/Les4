package Homework;

import java.util.Arrays;

public class Main {

    static void main(String[] args) {

        FirePokemon Charizard = new FirePokemon("Charizard", "benzine",36, 120, 2500, 1.7, 90.5);
        WaterPokemon Squirtle = new WaterPokemon("Blastoise", "zand", 36, 120, 2500, 16, 85);
        GrassPokemon Venusaur = new GrassPokemon("Venusaur", "pokon", 36, 120, 2500, false, 100);
        ElectricPokemon Pikachu = new ElectricPokemon("Pikachu", "sidderalen", 25, 80, 1500, 380, 6.5);

        printPokemonCard(Charizard);
        IO.println("Lengte: " + Charizard.getHeight());
        IO.println("==========================================");
        IO.println();
        printPokemonCard(Squirtle);
        IO.println("Defence "+Squirtle.getDefence());
        IO.println("==========================================");
        IO.println();
        printPokemonCard(Venusaur);
        IO.println("Accuracy: " +Venusaur.getAccuracy());
        IO.println("==========================================");
        IO.println();
        printPokemonCard(Pikachu);
        IO.println("Voltage: " + Pikachu.getVoltage());
        IO.println("==========================================");
        IO.println();


    }


    public static void printPokemonCard(Pokemon pokemon) {

        IO.println("==========================================");
        IO.println(" POKEMONKAART: " + pokemon.getName().toUpperCase());
        IO.println("==========================================");
        IO.println("Type: " + Arrays.toString(pokemon.getType())); //IntelliJ heeft deze zelf voorgesteld...
        IO.println("Level: " + pokemon.getLevel());
        IO.println("HP: " + pokemon.getHealthPoints());
        IO.println("XP: " + pokemon.getExperiencePoints());
        IO.print("Geluid: ");
        pokemon.speaks();
        IO.print("Eten: ");
        pokemon.eats();
        IO.print("Special: ");
        pokemon.specialAttack();
        IO.println("==========================================");

    }




}
