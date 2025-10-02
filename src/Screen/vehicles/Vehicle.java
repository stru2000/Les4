package Screen.vehicles;

/**
 * De basisklasse voor alle voertuigen.
 */
public class Vehicle {
    public Integer vin;
    public String brand;
    public String model;
    public Integer engines;
    public int numberOfSeats;
    public String kleur;
    public boolean gps;

    // Constructor voor de Vehicle klasse
    public Vehicle(String brand, Integer vin, String model, String kleur, Integer engines, int numberOfSeats, boolean gps) {
        this.brand = brand;
        this.vin = vin;
        this.model = model;
        this.kleur = kleur;
        this.engines = engines;
        this.numberOfSeats = numberOfSeats;
        this.gps = gps;
    }

    // Default constructor is handig
    public Vehicle() {
        this.brand = "Onbekend";
        this.vin = 0;
        this.model = "Onbekend";
        this.kleur = "Wit";
        this.engines = 1;
        this.numberOfSeats = 0;
        this.gps = false;
    }
}