package OOPS.Interfaces.extendedDemo2;

public interface A {
    default void fun(){
        System.out.println("Its A");
    }

    //static interface methods should always have a body
    static void greeting(){
        System.out.println("im static");
    }
}
