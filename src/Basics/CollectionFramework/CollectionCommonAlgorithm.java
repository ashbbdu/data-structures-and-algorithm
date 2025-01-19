package Basics.CollectionFramework;

import java.util.*;

public class CollectionCommonAlgorithm {
    public static void main(String[] args) {
        List <Integer> al = new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(1);
        System.out.println(al);
        Collections.sort(al);
        Integer max = Collections.max(al);
        Integer min = Collections.min(al);
        System.out.println(al);
        System.out.println(max);
        System.out.println(min);

        Collections.reverse(al);
        System.out.println(al);

        System.out.println(Collections.frequency(al , 1));

    }
}
