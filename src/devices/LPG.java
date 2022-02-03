package devices;

public class LPG extends Car{
    public LPG(String producer,
               String model,
               Integer howManyDoors,
               Integer yearOfProduce,
               Double value) {
        super(producer, model, howManyDoors, yearOfProduce, value);
    }

    @Override
    public void refuel() {
        System.out.println("Fill the gas");
    }
}
