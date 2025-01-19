package Basics.CollectionFramework.Map;

import java.util.HashMap;

public class HashMapTut {
    public static void main(String[] args) {
//        TC :  0 (log N)
//        key values
//        does not store key in sorted order
        HashMap <Integer , String> hm = new HashMap<>();
        hm.put(1 , "Raj");
        hm.put(2 , "Striver");
        hm.put(3 , "Ashish");
        System.out.println(hm);
        System.out.println(hm.get(1));
        hm.remove(2);
        System.out.println(hm);
    }
}
