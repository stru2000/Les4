package Lesopdrachten;

public abstract class WildAnimal {

    public WildAnimal(String name, String gender, String enclosureName, String LastFedDay, String originCountry) {
    super(name,gender);
    this.enclosureName = enclosureName;
    this.lastFedDay = lastFedDay;
    this.originCountry = originCountry;

    }
}

