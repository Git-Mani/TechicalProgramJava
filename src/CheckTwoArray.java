
public class CheckTwoArray {
    public static void main(String args[]){
    
    
 
            int a[]={3,6,10,31};
            int b[]={3,6,10,31};
            int flag=0;
            if(a.length==b.length){
            
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                    flag=1;
                    }                
                
                
                }
                if(flag==1)
                    System.out.print("equal");
                
            }
    
    
    }
    
}
