package Homework;

abstract class Pokemon {

    private final String[] type;
    private final String name;
    private String food;
    private int level;
    private int healthPoints;
    private int experiencePoints;
    ;

    public Pokemon(String[] type, String name, String food, int level, int healthPoints, int experiencePoints) {
        this.type = type;
        this.name = name;
        this.food = food;
        this.level = level;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
    }

    //getters en setters
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

    public String[] getType() {
        return type;
    }

    public String getFood() {
        return food;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    //methodes


    abstract public void speaks();
    abstract public void specialAttack();
    public void eats(){
        IO.println(food);
    }




}
