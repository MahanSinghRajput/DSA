package OOPS.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abc = new Human(45,"abc");
        Human twin = (Human)abc.clone();
        System.out.println(twin.age);
    }
}
