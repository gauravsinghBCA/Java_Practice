package multiThreading;
class executeHere11 implements Runnable{
    @Override
    public void run() {
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("stay away from main");
    }
}

class executeHere12 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("near to main");
        
    }
}

public class multithreading2 {
    public static void main(String[] args) {
        System.out.println("in main");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        executeHere11 eh = new executeHere11();
        executeHere12 eh1 = new executeHere12();
        Thread th = new Thread(eh);
        Thread th0 = new Thread(eh1);
        th.start();
        th0.start();;
    }
}
