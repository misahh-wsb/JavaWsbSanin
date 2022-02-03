package devices;
public abstract class Device {
    final public String model;
    final public Integer yearOfProduction;
    final public String producer;


    public Double value;
    public Device(String producer, String model, Integer yearOfProduction, Double value) { //Zad 7
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    @Override
    public String toString() { //Zad 7
        return "Device{" +  "Producer: " + producer +
                ", Model: " + model +
                ", yearOfProduction: " + yearOfProduction +
                ", value=" + value + '}';
    }
    abstract public void turnOn();
}
