
import java.util.ArrayList;


public class RemoveDuplicateFromArrayLst {
  public static void main(String args[]){
  
  
  ArrayList<Integer> arr=new ArrayList<Integer>();
  
  arr.add(22);
  arr.add(22);
  arr.add(23);
  arr.add(21);
  arr.add(23);
  
  
  for(int i=0;i<arr.size()-1;i++)
  {
      for(int j=i+1;j<arr.size();j++)
      {
          if(arr.get(i)==arr.get(j))
              arr.remove(i);
      
      }
  
  }
 for(int i=0;i<arr.size();i++)
  System.out.print(arr.get(i)+" ");
  
  }  
}
