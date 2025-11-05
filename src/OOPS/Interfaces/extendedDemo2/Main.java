package OOPS.Interfaces.extendedDemo2;

public class Main implements A,B{
    @Override
    public void greet() {

    }
    //we are not adding fun() but still its not showing error bcoz fun is set to default

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting(); //static methods are called by their classes
    }
}
