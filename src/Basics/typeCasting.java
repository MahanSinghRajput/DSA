package Basics;

import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        //you cant type cast small into large like int to float directly;
        //float num=abc.nextInt(); //allowed
        // int num=abc.nextFloat(); //not allowed

        //Type casting
        int num1=(int)67.45;
        System.out.println(num1);

        //automatic type promotion in expression
        int a=257;
        byte b=(byte)a;
        System.out.println(b); //a%256
    }
}
