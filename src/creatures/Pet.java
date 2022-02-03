package creatures;

public class Pet extends Animal {
    public Pet(String species,
               String name,
               Integer age,
               Boolean alive) {

        super(species);
        this.name = name;
        this.age = age;
        this.live = true;
    }


    public void feed() {
        System.out.println("The animal was fed");
    }
    public void feed(Double foodWeight) {
        System.out.println("The animal was fed, weight foot: " + foodWeight + "kg");
    }
}
