
import java.util.ArrayList;
import java.util.Iterator;

//get value of arraylist
public class ArrayListOperation {
    
    public static void main(String args[]){
        
        ArrayList <Integer> arr=new ArrayList<Integer>();
        
        arr.add(22);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
        
        Iterator itr= arr.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
          
        
        
         for(Integer obj : arr) {
            System.out.println(obj);
            }
    
    }
    
}
