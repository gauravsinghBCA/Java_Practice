package Queue;

// it will run @intelij idea
import java.util.LinkedList;
import java.util.Queue;

public class Qimplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // to add data in queue--enqueue
        for(int i=0; i<5; i++){
            q.add(i);
        }
        System.out.println("queue looks like:"+q);
        // show top data in queue
        System.out.println("first data is :"+q.peek());
        //to remove data from queue--dequeue
        q.remove();
        System.out.println("after deletion data:"+q);
        System.out.println("first data is :"+q.peek());
        // to check size of queue
        System.out.println("size is:"+q.size());
    }
}
