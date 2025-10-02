package Screen.vehicles;

public class CarMain {

    public static void main(String[] args) {

        // Maak een Car object met de nieuwe constructor
        Car mijnAuto = new Car(
                "Tesla",
                54321,
                "Model 3",
                "Rood",
                4,
                0, // Elektrische auto heeft 0 motorinhoud
                false,
                Brandstof.EV
        );

        System.out.println("--- Auto Details ---");
        System.out.println("Merk: " + mijnAuto.brand);        // Erft van Vehicle
        System.out.println("Model: " + mijnAuto.model);       // Erft van Vehicle
        System.out.println("VIN: " + mijnAuto.vin);           // Erft van Vehicle
        System.out.println("Aantal Deuren: " + mijnAuto.numberOfDoors);
        System.out.println("Motorinhoud: " + mijnAuto.motorinhoud + " cc");
        System.out.println("Brandstof: " + mijnAuto.brandstoftype);
        System.out.println("Kleur: " + mijnAuto.kleur);       // Erft van Vehicle

    }
}

