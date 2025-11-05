package Searching.BSquestions;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(infiniteSearch(arr,target));
    }

    //infinite array means that length is not known
    static int infiniteSearch(int[] arr, int target){
        // first find the range
        // start with box of size 2
        int start = 0, end = 1;
        //condition for the target to lie in the range is target<arr[end]
        while(target>arr[end]){
            int newStart = end + 1;
            // double the box value; end = previous end + sizeOfBox*2;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start,int end){
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
