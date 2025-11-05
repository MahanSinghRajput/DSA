package Methods;

import java.util.Scanner;

public class changeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={0,1,2,3,4};
        changeArr(arr);
        System.out.println(arr[0]);
    }

    static void changeArr(int[] arr) {
        arr[0]=99; //here the value is changed as strings are immutable but values can be changed
    }
}
