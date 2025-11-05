package OOPS.Principles.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        square.area();
        Shapes sq = new Square();
        sq.area(); //it is accessing square not shapes
    }
}
