void main() {
    HashMap<String, Integer> nummers = new HashMap<>();
    nummers.put("een", 1);
    nummers.putIfAbsent("een", 2);
    IO.println(nummers.get("een"));


    Person p = new Person();
    IO.println(p.toString());
}

public class Person{
    String name;
    Integer age;

    public Person(String name, Integer age){
        this.age = age; this.name = name;
    }

    public Person(String name){
        this.age= 0;
        this.name = name;
    }

    public Person (){
        this.age = 0;
        this.name = "vondeling";
    }

    public Integer getAge(){return age;}
    public void incAge(){age+=1;};
    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    @Override
    public String toString() {
        return "Person{name='"+name+"', age="+age+'}';
    }
}
