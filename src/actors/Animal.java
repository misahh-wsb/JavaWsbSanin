package actors;

public class Animal {

    public String name;
    public Integer age;

    private Double weight;
    final String species;

    Boolean live;


    //Zad 1
    public void feed() {
        if (!live && weight <= 0)
        {
            System.out.println("The animal is dead");
        }
        else
        {
            this.weight += 1;
            System.out.println("Weight after a walk " + this.weight + " kg");
        }
    }


    //Zad 1
    public Animal(String species)
    {
        this.live = true;
        this.species = species;

        if (this.species == "Collie")
        {
            this.weight = 5.5;
        }
        else if (this.species == "Akita")
        {
            this.weight = 5.0;
        }
        else
        {
            this.weight = 3.0;
        }
    }


    //Zad 1
    public void takeForAWalk()
    {
        if (this.weight <= 0)
        {
            System.out.println("The animal is dead");
            live = false;
        }
        else
        {
            this.weight -= 1;

            if (this.weight <= 0.0)
            {
                this.weight = 0.0;
                System.out.println("The animal is dead");
                live = false;
            }
            System.out.println("New weight: " + this.weight + " kg");
        }
    }


    public void PrintName()
    {
        System.out.println(this.name);
    }

    public void doYouLike(String foodType)
    {
        if (this.species == "Collie" && foodType == "sausage")
        {
            System.out.println("I like it! " + foodType);
        }
        else
        {
            System.out.println("No I do not like it!"+ foodType);
        }
    }

    public Integer getHumanAge()
    {
        if (this.species == "Akita")
        {
            return this.age * 4;
        }
        else if (this.species == "Collie")
        {
            return this.age * 6;
        }
        else
        {
            return this.age;
        }
    }


    //Zad 6
    public String toString()
    {
        return  name + ", " +
                species + ", " +
                weight + ", " +
                age + ", " +
                live + ". ";
    }

}