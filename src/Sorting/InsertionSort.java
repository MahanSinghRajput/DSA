package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,9,6,57,45};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
/*
    arr = [5,3,4,1,2] //after every pass array gets sorted as size increases.

    1st pass -> [3,5,4,1,2]
    2nd pass -> [3,4,5,1,2]
    3rd pass -> [1,3,4,5,2]
    4th pass -> [1,2,3,4,5]
 */
