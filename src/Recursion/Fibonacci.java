package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n==1 || n==0) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
