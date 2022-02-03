package actors;

import creatures.Animal;
import devices.Car;
import devices.Phone;
import java.time.LocalDate;

public class Human extends Animal {
    public Double cash;
    public Phone phone;
    public Animal pet;
    public String firstName;
    public String lastName;
    public Integer age;
    public Car myCar;

    private Double salary;


    //Zad 3 and 4
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

    //Zad 3 and 4
    public Double getSalary() {
        LocalDate localdate = LocalDate.now();

        System.out.println(localdate+ " - Wynagrodzenie: " + this.salary);
        return this.salary;
    }

    public Human() {
        super("wise man");

        this.salary = 2000.0;

    }

    //Zad 5
    public void setMyCar(Car myCar)
    {
        if (myCar.value < salary)
        {
            System.out.println("Udało się kupić samochód za gotówkę");
            this.myCar = myCar;
        }
        else if (myCar.value / 12 < salary)
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            this.myCar = myCar;
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
                pet + getMyCar();
    }


    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("It's illegal!!");
    }

    @Override
    public void feed() {
        System.out.println("fedded");
    }

    public void feed(Double foodWeight) {
        System.out.println("Weight after eating: " + foodWeight + "kg");
    }

    //Zad 5
    public Car getMyCar()
    {
        return myCar;
    }
}



