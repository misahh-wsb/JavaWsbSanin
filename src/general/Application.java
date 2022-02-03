package general;

public class Application {
    public String name;
    public Double version;
    public Double price;

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", price=" + price +
                '}';
    }

    public Application(String name) {
        this.name = name;
    }
    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }



}

