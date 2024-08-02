package Stack;

import java.util.*;

public class implemetation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        // before deleting
        System.out.println("before deleting");
        System.out.println("topmost element is " + st.peek());
        // searchig function
        //search function returns -1 when element not present is stack
        System.out.println(" 4 is present on:" + st.search(4));
        //empty function returns boolean vlaue(false/true)
        System.out.println(" is stack empty of not:" + st.empty());
        st.pop();
        // after deleting
        System.out.println("after deleting");
        System.out.println("topmost element is " + st.peek());

    }
}
