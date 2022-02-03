package creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String values) {
        super(values);
    }


    public void feed() {
        System.out.println("The farm-animal was fed");
    }
    public void feed(Double foodWeight) {
        System.out.println("The farm-animal was fed, weight foot: " + foodWeight + "kg");
    }

    @Override
    public void beEaten() {
        System.out.println("The farm-animal is edible!");
    }



}