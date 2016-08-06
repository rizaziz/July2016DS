package datastructure;
import java.util.*;
/**
 * Created by Aziz on 8/6/2016.
 */
public class ExampleMap {
    public static void main(String[] args){
        Map<Integer, String> numbers=new HashMap<>();
        for(int i=0; i<5000; i++){
          numbers.put(i, null);
        }
        /*
        numbers.put(1, "one");
        numbers.put(2,"two");
        numbers.put(3,"three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        */

        for(Map.Entry<Integer, String> entry:numbers.entrySet())
            //System.out.println(entry.getKey()+": "+entry.getValue());
        System.out.println(entry);
    }
}
