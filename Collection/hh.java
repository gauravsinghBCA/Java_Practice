package Collection;
import java.util.*;
public class hh {
    
    public static void main(String[] args){
        ArrayList a5 = new ArrayList();
        a5.add(5);
        a5.add(4);
        a5.add(5);
        a5.add(8);
        System.out.println(a5);
        ArrayList a6 = new ArrayList();
        a6.add(7);
        a6.add(8);
        a5.addAll(a6);
        System.out.println(a5);
    }
}
