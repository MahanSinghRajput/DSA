package Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
       // int n=a.nextInt();
       // System.out.println(armstrong(n));
        for(int i=100;i<1000;i++){
            if(armstrong(i))
                System.out.println(i);
        }
    }
    static boolean armstrong(int n){
        int o=n;
        int a=0;
        while(n>0){
            int r=n%10;
            a=a+(int)Math.pow(r,3);
            n=n/10;
        }
        if(o==a)
            return true;
        return false;
    }
}
