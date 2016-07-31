package datastructure;
import java.util.*;
/**
 * Created by Aziz on 7/31/2016.
 */
public class UseArrayList {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");
        for(String str:list){
            System.out.println(str);
        }
    }
}
