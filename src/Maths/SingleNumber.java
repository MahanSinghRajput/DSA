package Maths;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        //to find single element in an array just xor all the elements
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
