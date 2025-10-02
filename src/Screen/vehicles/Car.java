package Screen.vehicles;

/**
 * Erft van Vehicle en voegt auto-specifieke eigenschappen toe.
 */
public class Car extends Vehicle {

    // Veld 'kleur' is verwijderd om verwarring met de 'kleur' van Vehicle te voorkomen.
    public int motorinhoud;
    public boolean trekhaak;
    public Brandstof brandstoftype; // Gebruik de enum als type
    public int numberOfDoors;

    // Correcte constructor. Roep de superklasse constructor aan met 'super()'.
    public Car(String brand, Integer vin, String model, String kleur, int numberOfDoors, int motorinhoud, boolean trekhaak, Brandstof brandstoftype) {
        // Roep de constructor van Vehicle aan
        super(brand, vin, model, kleur, 1, 5, true); // Standaard auto waarden (1 motor, 5 zitplaatsen, met GPS)

        this.numberOfDoors = numberOfDoors;
        this.motorinhoud = motorinhoud;
        this.trekhaak = trekhaak;
        this.brandstoftype = brandstoftype;
    }

    // Default constructor voor Car
    public Car() {
        super();
        this.numberOfDoors = 4;
        this.motorinhoud = 1600;
        this.trekhaak = false;
        this.brandstoftype = Brandstof.BENZINE;
    }
}

// De enum definitie, idealiter in een apart bestand: Brandstof.java
enum Brandstof {
    EV, BENZINE, DIESEL, HYBRIDE
}