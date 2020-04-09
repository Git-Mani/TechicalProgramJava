
import java.util.Scanner;


public class PrimeNumber {
    public static void main(String args[]){
        
        int n,c=0;
        n=(new Scanner(System.in)).nextInt();
    
        for(int i=2;i<n/2;i++){
        
            if(n%i==0 )
                c++;
        }
    
        if(c==0)
            System.out.println("prime");
       
    }
}
