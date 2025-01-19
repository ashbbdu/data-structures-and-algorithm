package Basics;

import java.util.*;

public class CusotomComaparatorTut {
    public static void main(String[] args) {
        List <Integer> al = new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(1);
        al.add(2);
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if(num1 < num2) {
                    return 1;
                } else if (num1 > num2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(al);
    }
}
