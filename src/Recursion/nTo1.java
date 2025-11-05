package Recursion;

import java.util.Scanner;

public class nTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         //print(n);
        //printRev(n);
        //System.out.println(sumOfDigits(n));
    }
    static void print(int n){
        if( n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        //print(n--); //n-- leads to infinite recursion
        print(--n); //it works well
    }
    static void printRev(int n){
        if(n==0) return;
        printRev(n-1);
        System.out.println(n);
    }
    static int sumOfDigits(int n){
        if(n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }
}
