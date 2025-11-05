package Maths;

import static Maths.HCF.gcd;

public class LCM {
    public static void main(String[] args) {
        int a = 2,b = 7;
        System.out.println(lcm(a,b));
    }
    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
