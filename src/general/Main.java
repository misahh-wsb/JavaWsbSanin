package general;

import devices.Car;
import creatures.Animal;
import creatures.Pet;
import actors.Human;
import devices.Phone;
import devices.Electric;
import devices.Disel;
import devices.LPG;
import creatures.FarmAnimal;
public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Collie");
        //Animal dog2 = new Animal("Akita");
        dog.name = "John";
        dog.age = 5;
        //dog2.name = "Doe";
       // System.out.println(dog2.name);
       // dog2.doYouLike("carrot");
        System.out.println(dog.name);
        dog.doYouLike("sausage");
        Integer humanAge = dog.getHumanAge();
        System.out.println("Age to humans: " + humanAge);


        //Zad 1
        /*dog2.feed();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.takeForAWalk();
        dog2.feed();
        dog2.takeForAWalk();*/


        Human me = new Human();
        me.firstName = "Mykhailo";
        me.lastName = "Sanin";
        me.age = 20;
        me.pet = dog;

        //Zad 3 and 4
        me.setSalary(10000.0);
        me.getSalary();

        //Zad 2
        me.getMyCar(1);
        Car myCar = new Car(
                "BMW",
                "E26",
                4,
                2001,
                100000.00)
        {
        public void refuel(){}
        };

        System.out.println(
                        "My car:, " + myCar.producer +
                        " (" + myCar.model +
                        " - "+ myCar.yearOfProduce+
                        "), with" + myCar.howManyDoors +
                        " doors");

        //Zad 5
        me.setSalary(10000.0);
        //me.setMyCar(myCar);

        Animal testhuman = new Human();
        me.pet = testhuman;
        me.pet.feed();


        Human friend = new Human();
        friend.cash = 5000.0;
        me.cash = 5000.0;

        testhuman.sale(me, friend, 500.0);


        //dog.sale(me,friend,500.0);
        Phone myPhone = new Phone("Iphone", "11", 2021, 3400.0);
        System.out.println(myPhone);
        myPhone.turnOn();


        System.out.println(myCar);
        myCar.turnOn();


        //Zad 6
        Car myCar2 = new Car(
                "BMW",
                "E26",
                4,
                2001,
                100000.00)
        {
            public void refuel(){}
        };

        Car myCar3 = myCar;
        System.out.println(myCar.equals(myCar2));
        System.out.println(myCar.equals(myCar3));
        System.out.println("My car 1 - " +myCar);
        System.out.println("My car 2 - " +myCar2);
        System.out.println("My car 3 - " +myCar3);
        System.out.println("Me - " +me);
        System.out.println("My dog - " + dog);

        me.phone = myPhone;
        myPhone.sale(me, friend, 4000.0);

        myCar.sale(me, friend, 15000.0);
        //System.out.println("My car: " + me.myCar);
        //System.out.println("Friend's car " + friend.myCar);




        Pet TestDog = new Pet("TestDog", "TestDog", 6, true);
        TestDog.feed(1.0);
        TestDog.feed();

        Electric eCar = new Electric("BMW", "E45", 4, 2021, 100000.00);
        Disel dCar = new Disel("BMW", "D46", 4, 1990, 5000.00);
        LPG lpgCar = new LPG("BMW", "L47", 4, 2010, 30000.00);
        eCar.refuel();
        dCar.refuel();
        lpgCar.refuel();
        me.AddCar(eCar);
        me.AddCar(dCar);
        me.AddCar(lpgCar);
        me.AddCar(myCar);
        me.AddCar(myCar3);
        System.out.println(me.AllCars());
        me.RemoveTheCar(myCar3);

        FarmAnimal goat = new FarmAnimal("cattle");
        goat.feed(2.0);
        goat.feed();
        goat.beEaten();

        Application WsbNews = new Application("WSB-News", 2.0, 0.0);
        Application WsbPay = new Application("WSB-Pay", 3.0, 0.0);
        Application WsbBooks = new Application("WSB-Books", 6.0,30.0);

        myPhone.NewAppInstall(WsbPay,me);
        myPhone.isInstalled(WsbPay);

        myPhone.isInstalled(WsbNews);
        myPhone.NewAppInstall(WsbNews,me);

        myPhone.NewAppInstall(WsbBooks,me);
        myPhone.AmountInstalledApps();
        System.out.println(myPhone.AppsCollection);

        myPhone.NameSort();
        myPhone.PriceSort();
        myPhone.AllFreeApps();

        Car RareCar = new Car("Oldsmobile", "F-88", 2, 1954, 12000000.00) {
            public void refuel() {
                System.out.println("93 gasoline");
            }
        };
        me.AddCar(RareCar);
        RareCar.OwnersOfCar.add("Mykhailo");
        RareCar.sale(me, friend, 1000.00);
        System.out.println("Owners: " + RareCar.OwnersOfCar);
        System.out.println(RareCar.OwnersOfCar.size());
        RareCar.FirstOwner();
        RareCar.QuantityOwners();
        }
    }
