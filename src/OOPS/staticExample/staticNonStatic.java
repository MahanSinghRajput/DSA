package OOPS.staticExample;

public class staticNonStatic {
    public static void main(String[] args) {
        //greeting(); //it gives error as non static cant be called in static
        //we can do:
        //fun();
        staticNonStatic abc = new staticNonStatic();
        abc.fun2();
    }
    void greeting(){
        System.out.println("Hello");
       // fun(); // static can be called in non static
    }
    static void fun(){
        System.out.println("fun");
        staticNonStatic obj = new staticNonStatic();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
}
