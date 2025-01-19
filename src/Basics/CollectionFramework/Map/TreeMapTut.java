package Basics.CollectionFramework.Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTut {
    public static void main(String[] args) {
//        TreeMap is similar to HashMap , the only difference is it stores keys in sorted order
        TreeMap <Integer , String> tm = new TreeMap<>();
        tm.put(3 , "Maddy");
        tm.put(1 , "Ashish");
        tm.put(2 , "Ash");
        tm.put(-1 , "xyz");
        tm.put(2 , "Priyanka");  // Ash will be replaced by Priyanka because the key 2 is already being used
        System.out.println(tm);


        System.out.println(tm.ceilingKey(-2));
        System.out.println(tm.floorKey(4));

        Set <Integer> st = tm.keySet();
        System.out.println(st);
    }
}

// I will be placed in top US based remote job soon .
