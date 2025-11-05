package Searching;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 8, 20, 22, 23, 45, 56, 78, 99, 134};
        int target = 22;
        System.out.println(binarySearch(arr,target));
    }

    // returns index
    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            //int mid = (start+end)/2; // might be possible that the mid value exceeds the range of int
            //better way to find mid
            int mid = start + (end-start)/2; // in this mid no value can exceed int
            if(target<arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
