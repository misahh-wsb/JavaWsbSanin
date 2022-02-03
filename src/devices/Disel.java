package devices;

public class Disel extends Car{
        public Disel(String producer,
                     String model,
                     Integer howManyDoors,
                     Integer yearOfProduce,
                     Double value)
        {
        super(producer, model, howManyDoors, yearOfProduce, value);
        }



    @Override
    public void refuel() {
        System.out.println("Fill diesel");
    }
}
