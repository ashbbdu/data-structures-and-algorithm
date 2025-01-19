package Basics.CollectionFramework.Interface.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequeueTut {
    public static void main(String[] args) {
        ArrayDeque <Integer> ad = new ArrayDeque<>();
//        ad.add(1);
//        ad.add(2);

//        here offer means add , but add is also working
        ad.offer(3);
        ad.offer(2);
        ad.offer(4);
        ad.offer(-1);
        ad.offer(9);
        System.out.println(ad.peek()); // 3 because Queue follows FIFO approach
        System.out.println(ad);

//       poll means take out the first inserted element
        ad.poll();
        System.out.println(ad);
        System.out.println(ad.peek());

//        other methods are offerFirst , offerLast

    }
}
