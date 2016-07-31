package reader;
import java.io.*;
/**
 * Created by Aziz on 7/31/2016.
 */
public class ReadText {
    public static void main(String[] args) {
        String path="C:\\Users\\Aziz\\Desktop\\Documentation.txt";
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr=new FileReader(path);
            br=new BufferedReader(fr);
            String text="";
            while((text=br.readLine())!=null){
                System.out.println(text);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
