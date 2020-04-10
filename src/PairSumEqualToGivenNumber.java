
public class PairSumEqualToGivenNumber {
    public static void main(String args[]){
    
    int n=20,sum=0,temp=0;
    
        int a[]={4, 5, 7, 11, 9, 13, 8, 12};
        
        for(int i=0;i<a.length;i++)
        {
                     
            for(int k=i;k<a.length;k++)
                 
            {
                
                    if(a[i]+a[k]==n)    
                        System.out.println(a[i]+","+a[k]);
       
                             
                
            }
       
            
              
        }
        
        
        }
        
        
    
    
}
