package Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,9,6,57,45};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max element in the remaining array and swap with correct index
            int last = arr.length - 1 - i;
            int max = maxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int n, int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    static int maxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i] > arr[max]) max = i;
        }
        return max;
    }
}
