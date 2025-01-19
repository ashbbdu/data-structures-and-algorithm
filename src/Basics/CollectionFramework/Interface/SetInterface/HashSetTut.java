package Basics.CollectionFramework.Interface.SetInterface;

import java.util.HashSet;

public class HashSetTut {
    public static void main(String[] args) {
//        stores unique element in random order
        HashSet <Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(1);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);

//        another way of printing the hs
        for (var num : hs) {
            System.out.println(num);
        }
    }
}
