package datastructure;
import java.util.*;
/**
 * Created by Aziz on 8/6/2016.
 */
public class UseListMap {
    public static void main(String[] args){
        List<String> citiesOfUSA=new ArrayList<>();
        citiesOfUSA.add("NY");
        citiesOfUSA.add("PA");
        citiesOfUSA.add("AR");

        List<String> citiesOfUK=new ArrayList<>();
        citiesOfUK.add("London");
        citiesOfUK.add("Manchester");
        citiesOfUK.add("Kent");

        List<String> citiesOfBangladesh=new ArrayList();
        citiesOfBangladesh.add("Dhaka");
        citiesOfBangladesh.add("Komilla");
        citiesOfBangladesh.add("Sylukha");

        List<String> citiesOfCanada=new ArrayList();

        Map<String, List<String>> map=new HashMap<>();
        map.put("USA", citiesOfUSA);
        map.put("UK", citiesOfUK);
        map.put("Banglades", citiesOfBangladesh);

        System.out.println(map);

        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            System.out.print(entry.getKey()+": ");

            for(String str:entry.getValue()){
                System.out.print(str+", ");
            }

            System.out.println();
        }
    }
}
