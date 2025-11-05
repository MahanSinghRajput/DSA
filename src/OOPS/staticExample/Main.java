package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human abc = new Human(20,"abc",10000000,false);
        System.out.println(abc.name);
        System.out.println(abc.population);
        Human bcd = new Human(30,"bcd",20000000,true);
        System.out.println(bcd.population);
        System.out.println(abc.population); //dont use these, the convention is:
        System.out.println(Human.population);
    }
}
