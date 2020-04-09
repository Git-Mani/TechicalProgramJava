
import java.util.Scanner;


public class SecondHighest {
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
    
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
int max=0,max2=0;

for(int i=0;i<n-1;i++)
{
    //max=max2;
   if(Math.max(a[i],max)>max){
   
   max2=max;
   max=Math.max(a[i],a[i+1]);
   
   }
   

}

System.out.println(max2);
    }

    
}
