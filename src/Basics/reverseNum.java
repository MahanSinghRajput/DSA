package Basics;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println(rev);
    }
}
