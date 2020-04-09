import java.util.*;
import java.util.Map.Entry;

//iterate hashmap using advance for loop
public class IterateHashMap {
    public static void main(String args[]){
    
    HashMap<Integer , String> map=new HashMap<Integer , String>();        
    
    
  
   
         map.put(3, "kuta");
        map.put(2, "ravi");
        map.put(1, "mani");
   
    Iterator itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
         Map.Entry m = (Map.Entry) itr.next();
            System.out.println("Key is " + m.getKey() + " Value is " + m.getValue());
        }
        
   
  for(Entry m: map.entrySet()) {
            System.out.println("Key is: " + m.getKey() + " Value is: " + m.getValue());
   
   
   
   }
    
    
    }
    
    
    
}
