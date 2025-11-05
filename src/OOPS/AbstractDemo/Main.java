package OOPS.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.career();
        Daughter daughter = new Daughter(23);
        daughter.career();
        Parent.hello();
    }
}
