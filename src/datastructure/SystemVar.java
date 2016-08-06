package datastructure;
import java.util.*;
/**
 * Created by Aziz on 8/6/2016.
 */
public class SystemVar {
    public static void main(String... args){

        for(Map.Entry<String,String> entry:System.getenv().entrySet()){
            System.out.println(entry);
        }

        System.out.println("done!");


    }
}
