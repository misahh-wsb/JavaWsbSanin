package actors;

import creatures.Animal;
import devices.Car;
import devices.Phone;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Double salary;
    public Animal pet;
    public Integer age;
    public Double cash;
    public Phone phone;

    private static final int Garage_Size = 4;
    public Car[] garage = new Car[4];

    public Human() {
        super("wise man");
        this.salary = 1200.0;
        this.garage = new Car[Garage_Size];
    }

    public Human(Integer garageSize) {
        super("homo sapiens");
        this.salary = 2000.0;
        this.garage = new Car[garageSize];
    }


    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Mistake! Negative salary!");

        }
        else if (salary == 0)
        {
            System.out.println("Wynagrodzenie wynosi 0");
        }
        else
        {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego!");
            System.out.println("Proszę odebrać aneks do umowy od pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmanie wypłaty i nie ma sensu ukrywać dochodu!");
            this.salary = salary;
        }
    }

    public Double getSalary() {
        LocalDate localdate = LocalDate.now();

        System.out.println(localdate+ " - Wynagrodzenie: " + this.salary);
        return this.salary;
    }

    //Zad 5
    public void setMyCar(Car myCar, Integer parkingLotNumber)
    {
        if (myCar.value < salary)
        {
            System.out.println("Udało się kupić samochód za gotówkę");
            Scanner location = new Scanner(System.in);
            this.garage[parkingLotNumber] = myCar;
        }
        else if (myCar.value / 12 < salary)
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            Scanner location = new Scanner(System.in);
            this.garage[parkingLotNumber] = myCar;
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    //Zad 6
    public String toString()
    {
        return  firstName + ", " +
                lastName + ", " +
                salary + ", " +
                age + ", " +
                pet + Arrays.toString(garage);
    }

    public Car getMyCar(Integer parkingLotNumber)
    {
        return this.garage[parkingLotNumber];
    }


    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("It's illegal!!");
    }

    @Override
    public void feed() {
        System.out.println("Fedded");
    }

    public void feed(Double foodWeight) {
        System.out.println("Weight after eating: " + foodWeight + "kg");
    }

    public boolean hasCar(Car car) {
        try {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == car) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean ParkingNotFull() {
        try {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void RemoveTheCar(Car local_car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == local_car) {
                this.garage[i] = null;
                break;
            }
        }
    }

    public void AddCar(Car local_car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = local_car;
                break;
            }
        }
    }

    public double AllCars() {
        double value = 0;
        for (int i = 0; i < this.garage.length; i++) {
            value += getMyCar(i).value;
        }
        return value;
    }


}
