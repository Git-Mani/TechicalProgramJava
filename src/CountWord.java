//count number of word using hashmap
import java.util.*;
import java.io.*;


public class CountWord {
    
    public static void main(String args[]) throws Exception{
    
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    
    BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
    
    int c=0;
    String str=br.readLine();
    
    String str1[]=str.split(" ");
    
    for(int i=0;i<str1.length-1;i++){
    
        if(map.containsKey(str1[i]))
        {
            int count = map.get(str1[i]);
                map.put(str1[i], count+1);
        }else{
      map.put(str1[i], 1);
        
        }
   
    }
    
    
    System.out.print(map); 
    
    
    
    
    
    
    }
    
}
