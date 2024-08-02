package HashMap;
import java.util.HashMap;
import java.util.Map;

public class hashmapfun{
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap= new HashMap<>();
        hashmap.put(1,"gaurav " );// put()  function
        hashmap.put(4,"ritesh" );
        hashmap.put(3,"jishu" );
        hashmap.put(2,"adarsh" );
        System.out.println(hashmap);
        System.out.println("*******************************");
        System.out.println(hashmap.containsKey(4));
        System.out.println(hashmap.get(3));// get() function
        System.out.println("*****************************");
        hashmap.remove(2);// revome() function
        System.out.println(hashmap);
        // iteration using the for loop
        System.out.println("***************************");

        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.out.println("hashmap is:");
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    


    }
}