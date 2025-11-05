package Searching.BSquestions;

public class CeilAndFloor {
    // Ceil: Smallest element in array greater or equal to target.
    static int ceil(int[] arr, int target){
        if(target>arr[arr.length-1]) return -1;
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]<target) start = mid+1;
            else if(arr[mid]>target) end = mid-1;
            else return arr[mid];
        }
        return arr[start];
    }

    // Floor: Largest element in array less than or equal to target.
    static int floor(int[] arr, int target){
        if(target<arr[0]) return -1;
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]<target) start = mid+1;
            else if(arr[mid]>target) end = mid-1;
            else return arr[mid];
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceil(arr,target));
        System.out.println(floor(arr,target));
    }
}
