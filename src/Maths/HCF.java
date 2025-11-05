package Maths;

public class HCF {
    public static void main(String[] args) {
        int a = 20, b = 30;
        System.out.println(hcf(a,b));
        System.out.println(gcd(a,b));
    }
    // Euclidean algorithm
    static int hcf(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    //recursion
    static int gcd(int a,int b){
        if(a == 0) return b;
        return gcd(b%a,a);
    }
}
