
public class SelectionSort {
    
    static void selection(int arr[]){
    
        for(int i=0;i<arr.length-1;i++){
        int pos=i;
        
        for(int j=i+1;j<arr.length;j++){
        
        if(arr[j] < arr[pos] )
                {
                  pos=j;  
                }
        }
        
       int  temp = arr[i];
 
            arr[i] = arr[pos];
 
            arr[pos] = temp;
        
        }
    
    for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
 
        System.out.println();
    
    }
    
    public static void main(String args[]){
    
    int a[]={2,5,-5,1,23,0,-2};
    
    
    selection(a);
    }
}
