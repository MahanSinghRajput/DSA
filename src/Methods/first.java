package Methods;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(sum(a,b));
    }

    static int sum(int a,int b){
        return a+b;
    }
}
