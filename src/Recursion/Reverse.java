package Recursion;

import java.util.Scanner;

public class Reverse {
    static int s = 0;
    static void reverse1(int n){
        if(n==0) return;
        int rem = n%10;
        s = s*10 + rem;
        reverse1(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse2(n));
    }

    static int reverse2(int n){
        if (n == 0) return 0;
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        if(n%10 == n) return n;
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
