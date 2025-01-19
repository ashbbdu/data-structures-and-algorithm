package Basics.CollectionFramework.Interface.SetInterface;

import java.util.TreeSet;

public class TreeSetTut {
    public static void main(String[] args) {
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(1);
        ts.add(2);
        ts.add(1);
        ts.add(-1);
//        other methods are similar
        System.out.println(ts);
    }
}
