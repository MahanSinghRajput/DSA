package OOPS.Singleton;

public class singleton {
    private singleton() { //this constructor cant be accessed
    }
    private static singleton instance;
    public static singleton getInstance(){
        //check whether 1 object only is created or not
        if(instance == null) instance = new singleton();
        return instance;
    }
}
