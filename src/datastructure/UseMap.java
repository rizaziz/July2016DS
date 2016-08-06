package datastructure;
import java.util.*;
/**
 * Created by Aziz on 8/6/2016.
 */
public class UseMap {
    public static  void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("USA","New York");
        map.put("UK", "London");
        map.put("Canada", "Ottawa");
        map.put("Japan","Tokyo");
        map.put("Bangladesh","Dhaka");

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
