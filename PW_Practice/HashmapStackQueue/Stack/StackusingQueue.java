package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void add(int data) {
        // 1. move all the data from q1 to q2
        //time-comlexity=o(n)
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }
        // 2.push the new data in q1
        q1.add(data);
        // 3.move back all data q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }
    }
    // to delete the data from the stack
    //time-comlexity=o(1)
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("queue underflow");
            System.exit(0);
        }
        int ele= q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
       StackusingQueue obj = new StackusingQueue();
       add(2);
       add(4);
       add(7);
       add(5);
       System.out.println("top data of stack is "+remove());
    }
}
