package AdvancedFeatures;

@FunctionalInterface
interface Calculator {
    int add(int n1, int n2);
}

class Sum {
    int mysum(int n1, int n2) {
        return n1 + n2;
    }
}

class Mul {
    int mymul(int n1, int n2) {
        return n1 * n2;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        Sum s = new Sum();
        Calculator c = s::mysum;
        int abc = c.add(10, 20);
        System.out.println("Sum is " + abc);

        Mul ss = new Mul();
        Calculator cc = ss::mymul;
        int abcd = cc.add(10, 20);
        System.out.println("Product is " + abcd);
    }
}
