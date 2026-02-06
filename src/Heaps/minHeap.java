import java.util.*;
class minHeap{
    public static void main(String[] args){
        int[] arr = {10,9,8,7,4,58,96,20};
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) pq.offer(arr[i]);
		while(k-- > 1) pq.poll();
		System.out.println(pq.peek());
    }
}