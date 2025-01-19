package Basics.CollectionFramework;

import java.util.Stack;

public class StackTut {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek()); // return the element which was pushed last.
        st.pop(); // returns the last element .
        st.empty();
    }
}
