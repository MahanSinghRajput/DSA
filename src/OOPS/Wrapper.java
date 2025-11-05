package OOPS;

public class Wrapper {
    public static void main(String[] args) {
        // Integer num = new Integer(5); // soon to be removed, used in old versions
        int a = 10; //int value
        Integer num = 5; // num is an object here

        //here value can be reassigned instead of using final
        final A s = new A("abcd");
        s.name = "cdef";
        System.out.println(s.name);

        A obj;
        for(int i=0;i<100000000;i++){
            obj = new A("random");
        }
    }
}

class A{
    // when final is used with primitive datatype its value cant be reassigned
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destructed");
    }
}