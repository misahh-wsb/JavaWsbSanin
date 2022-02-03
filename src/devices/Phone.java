package devices;
import actors.Human;
import general.Salleable;
import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Salleable
{
    private static final String AppVersion = "Latest Version"; //Zadanie 7 ↓
    private static final String ServerIp = "176.56.46.1";




    public Double value;
    Double Screen;
    String Firmware;

    public Phone(String producer, String model, Integer yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
        this.value = value;
    }
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (seller.phone == null)
        {
            System.out.println("The seller has nothing to sell. ");
        }
        else if (buyer.cash < price)
        {
            System.out.println("Not enough money. ");
        }
        else if (!seller.phone.equals(this))
        {
            System.out.println("Not that model of phone.");
        }
        else
        {
            seller.phone = null;
            buyer.phone = this;
            seller.cash += price;
            buyer.cash -= price;
            System.out.println("Bought! " + this);
        }
    }


    @Override
    public void turnOn() {
        System.out.println("The power button is pressed");
    }



    public void AppInstall(String AppName) {
        System.out.println("Intaling " + AppName);
        this.AppInstall(AppName, AppVersion);
    }
    public void AppInstall(String AppName, String Version) {
        System.out.println("Intaling " + AppName + " ver. " + Version);
        this.AppInstall(AppName, Version, AppVersion);
    }
    public void AppInstall(String AppName, String Version, String Ip) {
        try{
            URL url = new URL("https", ServerIp, 443, AppName + "-" + Version);
        }
        catch (MalformedURLException e){
            System.out.println("Error! ");
            e.printStackTrace();
        }
    }

}
