package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class multiDimArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
        initialisation: int[][] arr = new int[n][]; //defining row size is must, column size may not be defined
        //arr.length will give number of rows
    */
//    int[][] arr = {
//            {1,2,3},
//            {4,5},
//            {6,7,8,9}
//    }; //sizes of arrays can vary inside an array.

        int[][] arr = new int[3][2];

        //input:
        for(int row=0; row < arr.length ; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        //output
//        for(int r=0;r<arr.length;r++){
//            System.out.println(Arrays.toString(arr[r]));
//        }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
