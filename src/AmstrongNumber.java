
import java.util.ArrayList;
import java.util.Scanner;



public class AmstrongNumber {
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    ArrayList <Integer> arr=new ArrayList<Integer>();
    int n=sc.nextInt();
    int num=n, rem,c=0,sum=0;
    while(num>0)
    {
        rem=num%10;
        num=num/10;
       
        arr.add(rem);
        c++;
    }
    for(int i=0;i<arr.size();i++)
    {
        int temp=1;
        for(int j=0;j<c;j++)
        {
        temp=arr.get(i)*temp;
        
        }
        sum=sum+temp;
    
    }
    //System.out.println(sum);
    if(sum==n)
        System.out.println("AS");
    }
    
}
