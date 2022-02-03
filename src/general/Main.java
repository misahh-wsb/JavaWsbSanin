package general;

import devices.Car;
import actors.Animal;
import actors.Human;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Collie");
        Animal dog2 = new Animal("Akita");
        dog.name = "John";
        dog.age = 4;
        dog2.name = "Doe";
        System.out.println(dog2.name);

        dog2.doYouLike("carrot");
        System.out.println(dog.name);
        dog.doYouLike("sausage");

        Integer humanAge = dog.getHumanAge();
        System.out.println("Age to humans: " + humanAge);

        //Zad 1
        dog2.feed();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.feed();
        dog2.takeForAWalk();


        Human me = new Human();
        me.firstName = "Mykhailo";
        me.lastName = "Sanin";
        me.age = 20;
        me.pet = dog;

        //Zad 3 and 4
        me.setSalary(10000.0);
        me.getSalary();

        //Zad 2
        me.getMyCar();
        Car myCar = new Car(
                "BMW",
                "E26",
                4,
                2001,
                100000.00);

        System.out.println(
                        "My car:, " + myCar.producer +
                        " (" + myCar.model +
                        " - "+ myCar.yearOfProduce+
                        "), with" + myCar.howManyDoors +
                        " doors");

        //Zad 5
        me.setSalary(10000.0);
        me.setMyCar(myCar);

        //Zad 6
        Car myCar2 = new Car(
                "BMW",
                "E26",
                4,
                2001,
                100000.00);

        Car myCar3 = myCar;
        System.out.println(myCar.equals(myCar2));
        System.out.println(myCar.equals(myCar3));
        System.out.println("My car 1 - " +myCar);
        System.out.println("My car 2 - " +myCar2);
        System.out.println("My car 3 - " +myCar3);
        System.out.println("Me - " +me);
        System.out.println("My dog - " + dog);
        }
    }
