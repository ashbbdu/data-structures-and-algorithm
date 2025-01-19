package Basics.CollectionFramework.Interface.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueTut {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        // stores element
        // and whenever you ask for peek , it gives you the smallest element

        pq.offer(1);
        pq.offer(0);
        pq.offer(5);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek());

        for (var num : pq) {
            System.out.println(num);
        }

        System.out.println("---------");
//      to print in ascending order
        while(pq.isEmpty() == false) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
