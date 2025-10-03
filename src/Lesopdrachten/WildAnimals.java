package Lesopdrachten;

public abstract class WildAnimalMain extends AnimalMain {

    String enclosureName;
    String lastFedDay;
    String originCountry;


    public WildAnimalMain(String name, String gender, String enclosureName, String lastFedDay, String originCountry) {
        super(name,gender);
        this.enclosureName = enclosureName;
        this.lastFedDay = lastFedDay;
        this.originCountry = originCountry;

    }
}

