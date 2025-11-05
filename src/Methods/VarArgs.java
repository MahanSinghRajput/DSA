package Methods;

import java.util.Arrays;

public class VarArgs {
    //used when we don't know how many arguments we are giving to the function.
    public static void main(String[] args) {
        fun(2,3,4);
        mulArgs(2,3,"msakd","dknsf","dnks");
    }

    static void mulArgs(int a,int b,String ...c){
        //variable arguments must always be given at the end of the function
        System.out.println(a+b);
        System.out.println(c[0]);
    }

    static void fun(int ...abc){
        //initialisation is done using these 3 dots(...)
        System.out.println(Arrays.toString(abc));
    }
}
