package Queue;
import java.util.Scanner;
import java.util.Stack;
public class QusingStack {
    public static void main(String[] args) {
        Stack<Integer> stack1= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value ");
        for(int i=0; i<5; i++){
            int n=sc.nextInt();
            stack1.push(n);
        }
         Stack<Integer> stack2= new Stack<>();
         for(int i=0; i<5; i++){
           stack2.push(stack1.pop());
         }
         System.out.println("operation like queue but usin stack ## first-in-first-out##");
         for(int i=0; i<5; i++){
            System.out.print("\t"+stack2.pop());
         }
         sc.close();
    }
}
