package Searching.BSquestions;
import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(mat,5)));
    }
    static int[] search(int[][] matrix, int target){
        int r = matrix.length;
        int c = matrix[0].length; //matrix may be empty
        if(r == 1){
            return binarySearch(matrix,0,0,c-1,target);
        }
        int rs = 0;
        int re = r-1;
        int cMid = c/2;
        while(rs < (re-1)){
            int mid = rs + (re-rs)/2;
            if(matrix[mid][cMid] == target) return new int[]{mid,cMid};
            else if(matrix[mid][cMid] < target) rs = mid;
            else re = mid;
        }
        if(matrix[rs][cMid] == target) return new int[]{rs,cMid};
        if(matrix[rs+1][cMid] == target) return new int[]{rs+1,cMid};
        if(target <= matrix[rs][cMid-1]){
            return binarySearch(matrix,rs,0,cMid-1,target);
        }
        if(target >= matrix[rs][cMid+1] && target<=matrix[rs+1][c-1]){
            return binarySearch(matrix,rs,cMid+1,c-1,target);
        }
        if(target <= matrix[rs+1][cMid-1]){
            return binarySearch(matrix,rs+1,0,cMid-1,target);
        }
        else{
            return binarySearch(matrix,rs+1,cMid+1,c-1,target);
        }
    }
    static int[] binarySearch(int[][] matrix,int row,int cs, int ce,int target){
        while(cs<=ce){
            int mid = cs +(ce-cs)/2;
            if(matrix[row][mid] == target) return new int[]{row,mid};
            else if(matrix[row][mid] < target) cs = mid + 1;
            else ce = mid - 1;
        }
        return new int[]{-1,-1};
    }
}
