package devices;

//Zad 2
public class Car
{
    public Integer yearOfProduce;
    public Integer howManyDoors;
    public Double value;
    public String model;
    public String producer;

    //Zad 5
    public Car(String producer, String model, Integer howManyDoors, Integer yearOfProduce, Double value)
    {
        this.yearOfProduce = yearOfProduce;
        this.howManyDoors = howManyDoors;
        this.value = value;
        this.model = model;
        this.producer = producer;
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


    public String toString(){
        return  producer + ", " +
                model + ", " +
                howManyDoors + ", " +
                yearOfProduce + ", " +
                value + ".";
    }
}