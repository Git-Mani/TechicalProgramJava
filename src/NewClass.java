//seprate non zero and zero

import java.util.*;

public class NewClass {
    public static void main(String args[]){
    int a[]={0,0,1,2,2,4,0};
    
     for(int i=0;i<a.length;i++)
     {
     
     if(a[i]!=0)
     {
     for(int j=i+1;j<a.length;j++)
     {
         if(a[j]==0)
         {
             int temp;
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
         }
     }
     }
     }
      for(int i=0;i<a.length;i++)
     System.out.println(a[i]);
}
}