package Sorting;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,4,5,1,3,9};
        inPlaceMergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); //its exclusive [a,b)
        return merge(left,right);
    }
    static int[] merge(int[] a,int[] b){
        int[] mix = new int[a.length + b.length];
        int i=0,j=0,k=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                mix[k++] = a[i++];
            }else {
                mix[k++] = b[j++];
            }
        }
        while(i<a.length){
            mix[k++] = a[i++];
        }
        while(j<b.length){
            mix[k++] = b[j++];
        }
        return mix;
    }

    static void inPlaceMergeSort(int[] arr,int s,int e){
        if(e-s == 1) return;
        int mid = (s+e) / 2;
        inPlaceMergeSort(arr,s,mid);
        inPlaceMergeSort(arr,mid,e);
        inPlaceMerge(arr,s,mid,e);
    }
    static void inPlaceMerge(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s];
        int i = s, j = mid, k = 0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]) mix[k++] = arr[i++];
            else mix[k++] = arr[j++];
        }
        while(i<mid){
            mix[k++] = arr[i++];
        }
        while(j<e){
            mix[k++] = arr[j++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}