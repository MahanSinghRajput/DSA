package Basics;
import java.util.Scanner;

public class digitSep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int r;
        int c=0;
        while(num>0){
            r=num%10;
            if(r==5) //counting how many times the number has a digit
                c++;
            num=num/10;
        }
        System.out.println(c);
    }
}
