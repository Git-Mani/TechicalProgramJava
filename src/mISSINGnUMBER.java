
public class mISSINGnUMBER {
    static int sumOfNnumbers1(int n)
    {
        int sum = (n * (n+1))/ 2;
 
        return sum;
    }
    
    static int sumOfNnumbers(int array[]){
    
    int sum = 0;
 
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
 
        return sum;
    }
    
    public static void main(String args[]){
    
    
    
    
    int a[]={1,3,4,5,6,7,8};
    
    
    int n=8;
    
    
   int sum1= sumOfNnumbers1(n);
    
    int sum=sumOfNnumbers(a);
   
    
    
    
    int missnumber=sum1-sum;
    
    System.out.print(missnumber);
    
    }
    
    
    
}
