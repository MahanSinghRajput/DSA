package OOPS.Principles.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        //System.out.println(box.l + " " + box.w + " " + box.h);
        BoxWeight box2 = new BoxWeight();
        //System.out.println(box2.h + " " + box2.weight);

        BoxWeight box3 = new BoxWeight(2,3,4,8);
        //System.out.println(box3.weight);

        Box box4 = new BoxWeight(2,3,4,8);
        //System.out.println(box4.weight); //gives error
        //There are many variables in both parents and child classes.
        //you are given access to variables that are in the reference type i.e. BoxWeight
        //hence, you should have access to weight variable.
        //This also means that the ones you are trying to access should be initialised
        //But here when the object itself is of type parent class, how will you call the constructor of child class
        //this is why error

        BoxPrice box5 = new BoxPrice();

    }
}
