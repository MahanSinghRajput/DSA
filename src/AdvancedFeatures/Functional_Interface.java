package AdvancedFeatures;
@FunctionalInterface
interface Calculato {
    int add(int n1, int n2);
}
public class Functional_Interface {
    public static void main(String[] args) {
        Calculato c = new Calculato() {
            @Override
            public int add(int n1, int n2) {
                return n1+n2;
            }
        };
        System.out.println("Sum ="+c.add(10, 20));
        Calculator c1=(n1,n2)-> n1+n2;
        System.out.println("Sum ="+c1.add(10, 20));
    }
}
