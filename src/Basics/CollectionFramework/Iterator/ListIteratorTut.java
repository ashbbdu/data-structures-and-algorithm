package Basics.CollectionFramework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorTut {
    public static void main(String[] args) {
//        ArrayList <Integer> al = new ArrayList<>();
        List<Integer> al = new ArrayList<>();  //better approach
        al.add(1);
        al.add(5);
        al.add(6);

        Iterator <Integer> it  = al.iterator();
        while(it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }
    }
}
