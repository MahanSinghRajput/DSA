package Comparator;
import java.util.*;

class Car {
    int year;
    String model;

    Car(int year, String model) {
        this.year = year;
        this.model = model;
    }
}

class SortByYear implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0;
    }
}

// Usage:
// Collections.sort(listOfCars, new SortByYear());

public class Basics {
    public static void main(String[] args) {
        Car ford = new Car(1999,"Endeavour");
        Car buggati = new Car(2005,"Chiron");
        Car porshe = new Car(2004,"911");
        ArrayList<Car> listOfCars = new ArrayList<>();
        listOfCars.add(ford);
        listOfCars.add(buggati);
        listOfCars.add(porshe);

        // Sort using SortByYear comparator
        Collections.sort(listOfCars, new SortByYear());

        // Print sorted cars
        for (Car car : listOfCars) {
            System.out.println(car.model + ": " + car.year);
        }
    }

}
