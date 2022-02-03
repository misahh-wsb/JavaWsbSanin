package devices;

import actors.Human;
import general.Salleable;
//Zad 2
public abstract class Car extends Device implements Salleable
{
    public Integer howManyDoors;
    public Integer yearOfProduce;

    public Car(String producer, String model, Integer howManyDoors, Integer yearOfProduce, Double value)
    {
        super(producer, model, yearOfProduce, value);
        this.value = value;
        this.howManyDoors = howManyDoors;
        this.yearOfProduce = yearOfProduce;
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (seller.getMyCar() == null) {
            System.out.println("The seller has nothing to sell. ");
        } else if (buyer.cash < price) {
            System.out.println("Not enough money. ");
        } else if (!seller.getMyCar().equals(this)) {
            System.out.println("Not that model.");
        } else {
            seller.myCar = null;
            buyer.myCar = this;
            seller.cash += price;
            buyer.cash -= price;


            System.out.println("Bought " + this + " !");
        }
    }


    //Zad 6
    @Override
    public boolean equals(Object object) {
        if (this == object)
        {
            return true;
        }
        else if (object == null)
        {
            return false;
        }
        else if (object instanceof Car) {
            Car o = (Car) object;
            if (producer.equals(o.producer) && model.equals(o.model) && howManyDoors == o.howManyDoors && yearOfProduce == o.yearOfProduce && value.equals(o.value))
            {
                return true;
            }

            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }




    @Override
    public void turnOn() {
        System.out.println("I start the car");
    }

    abstract public void refuel();

    public String toString(){
        return  producer + ", " +
                model + ", " +
                howManyDoors + ", " +
                yearOfProduce + ", " +
                value + ".";
    }

}