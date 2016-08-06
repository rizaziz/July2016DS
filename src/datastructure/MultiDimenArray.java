package datastructure;
import java.util.*;
/**
 * Created by Aziz on 8/6/2016.
 */
public class MultiDimenArray {
    public static void main(String[] args){
        Random r=new Random(50);
        int[][] arr=new int[100][100];

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){

                arr[i][j]=r.nextInt(1000);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
