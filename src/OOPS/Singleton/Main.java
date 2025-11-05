package OOPS.Singleton;

public class Main {
    public static void main(String[] args) {
        //singleton a = new singleton(); // it can be used if singleton is not private
        singleton obj = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();
        // all 3 are pointing to the same object
    }
}
