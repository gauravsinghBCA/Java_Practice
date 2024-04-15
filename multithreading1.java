package multiThreading;

// Explaining the concept of multithreading by extending thread class

 class executeHere extends Thread {  //thread0

    @Override
    public void run() {
        Thread th = Thread.currentThread();
         th.setName("guaravjishu"); // change name of currentThread
         th.setPriority(1);  //change priority of currentThread
        System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getPriority());
        System.out.println("i am in run");
    }
}
  class executeHere1 extends Thread{ // thread1
     
    @Override
    public void run() {
        Thread th = Thread.currentThread();
         th.setName("guarav");
         th.setPriority(2);
        System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getPriority());
        System.out.println("i am in run2");
    }
  }
public class multithreading1 {

    public static void main(String[] args) {  // main thread 
         System.out.println("main thread");
         Thread th = Thread.currentThread();
         th.setName("guarav");
         th.setPriority(3);
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getPriority());
        executeHere ex = new executeHere();
        executeHere1 ex1 = new executeHere1();
        ex.start();
        ex1.start();
    }   
}