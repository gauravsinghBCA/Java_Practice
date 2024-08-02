package HashMap;

import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {
        // order of insertion is preserved 
        LinkedHashMap<Integer,String> hashmap= new LinkedHashMap<>();
        hashmap.put(1,"gaurav " );// put()  function
        hashmap.put(4,"ritesh" );
        hashmap.put(3,"jishu" );
        hashmap.put(2,"adarsh" );
        System.out.println(hashmap);
    }
}
