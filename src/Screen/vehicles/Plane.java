package Screen.vehicles;

public class Plane extends Vehicle {

    public String pilot;
    public boolean cargo;

    public Plane(String brand, Integer vin, String model, String pilot, boolean cargo) {
        // Plane heeft vaak 2 of meer engines
        super(brand, vin, model, "Wit", 2, 100, true);
        this.pilot = pilot;
        this.cargo = cargo;
    }
}