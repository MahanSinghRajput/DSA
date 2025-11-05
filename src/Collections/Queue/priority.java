package Collections.Queue;

import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // isse jo bhi largest hoga wo bahar niklega pq.poll krne pe
        pq.offer(90);
        pq.offer(48);
        pq.offer(23);
        pq.offer(100);
        System.out.println(pq);

        pq.poll(); //smallest gets removed
        System.out.println(pq);
    }
}
