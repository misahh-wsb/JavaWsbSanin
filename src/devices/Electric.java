package devices;

public class Electric extends Car{

    public Electric(String producer,
                    String model,
                    Integer howManyDoors,
                    Integer yearOfProduce,
                    Double value) {
        super(producer, model, howManyDoors, yearOfProduce, value);
    }

    @Override
    public void refuel() {
        System.out.println("Plug the cable");
    }
}

