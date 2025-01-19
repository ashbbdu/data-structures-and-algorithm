package Basics.CollectionFramework;

import java.util.LinkedList;

public class LinkedListTut {
    public static void main(String[] args) {
//        LL is a two ended list we can add from from start and end
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll);

        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);
    }
}
