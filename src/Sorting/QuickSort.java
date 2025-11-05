package Sorting;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,9,7,3,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int s = low, e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s] < pivot) s++;
            while(arr[e] > pivot) e--;
            if(s<=e){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}
