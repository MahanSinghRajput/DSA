package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //we must used static then only population is same for all

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; //whenever a new human is created population is increased by 1.
    }
}
