package Lesopdrachten;

public abstract class Animals {



    private String name;
    private String gender;


    public Animals(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public void sleep(){IO.println("Slaapt 8 uur");}
    public void eat(String food){IO.println("Heeft "+food+" gegeten");}
    public void move(){IO.println("Heeft zich 0.25m verplaatst");}
    public void makeSound(){IO.print("Maakt geluid: ");}

}
