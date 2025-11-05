package StacksAndQueues;

import java.util.*;

public class Inbuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(5);
        stack.push(32);

        //System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);

        //System.out.println(queue.peek()); //first element shown not removed
        //System.out.println(queue.remove()); //first element removed

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(4);
        deque.add(5);
        deque.addFirst(6);
        deque.addLast(7);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.remove()); //removes first
    }
}
