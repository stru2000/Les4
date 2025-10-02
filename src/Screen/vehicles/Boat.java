package Screen.vehicles;

public class Boat extends Vehicle {
    public int diepgang;

    public Boat(String brand, Integer vin, String model, int diepgang) {
        super(brand, vin, model, "Blauw", 1, 8, false); // Boot heeft vaak geen GPS standaard
        this.diepgang = diepgang;
    }
}