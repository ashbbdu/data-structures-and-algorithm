package Basics.CollectionFramework.Interface;

import java.util.ArrayList;
import java.util.List;

public class CollectionTutorial {
    public static void main(String[] args) {
//   1)     List
//        a) Array List

        ArrayList <Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(2));
        aList.remove(1);
        System.out.println(aList);

//        add element at some index
        aList.add(1 , 50);
        System.out.println(aList);
        System.out.println( aList.contains(30));
    }
}
