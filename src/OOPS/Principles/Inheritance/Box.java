package OOPS.Principles.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        super(); //refers to Object class
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //square
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void info(){
        System.out.println("Running the box");
    }
}
