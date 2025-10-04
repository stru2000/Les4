package Lesopdrachten;

public abstract class WildAnimals extends Animals {

    String enclosureName;
    String lastFedDay;
    String originCountry;


    public WildAnimals(String name, String gender, String enclosureName, String lastFedDay, String originCountry) {
        super(name,gender);
        this.enclosureName = enclosureName;
        this.lastFedDay = lastFedDay;
        this.originCountry = originCountry;

    }
}

