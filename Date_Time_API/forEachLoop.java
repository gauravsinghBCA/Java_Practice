import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachLoop {
    public static void main(String[] args) {

//        List<Integer> list1 = new ArrayList<>(); //create list using add() method
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        list1.add(6);
//
//        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(7,8,9,10,11); // create list without using add() method
        System.out.println(list2);

//        for(Integer i: list2){
//            System.out.println(i);
//        }

//        Consumer<Integer> cons = i-> System.out.println(i);

       list2.forEach(i-> System.out.println(i));
    }
}
