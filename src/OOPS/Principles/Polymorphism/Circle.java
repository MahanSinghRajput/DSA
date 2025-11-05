package OOPS.Principles.Polymorphism;

public class Circle extends Shapes{
    //this will run when an object of circle class is created
    //hence it is overriding the parent method
    @Override //annotation
    void area(){
        System.out.println("Area is pi * r * r");
    }
}
