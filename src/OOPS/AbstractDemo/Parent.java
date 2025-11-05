package OOPS.AbstractDemo;

public abstract class Parent { //if a class has abstract methods than the class must be defined as abstract
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){ //static methods can be created
        System.out.println("hey");
    }

    void normal(){ //normal methods can be created
        System.out.println(" i am normal");
    }
    abstract void career();
    abstract void partner();

}
