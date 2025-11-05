package OOPS.staticExample;

class Test {
    static String name;// if we don't use static then abc and bcd are printed

    public Test(String name) {
        Test.name = name;
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Test a = new Test("abc");
        Test b = new Test("bcd");

        System.out.println(a.name); // prints "bcd"
        System.out.println(b.name); //both will show bcd as the string is set to static
    }
}
