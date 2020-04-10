
public class SubArraySum {
     
void sum(int arr[],int n){
 
int curr=arr[0],start=0;
for(int i=1;i<arr.length;i++)
{
    while(curr>n && start<i)
    {
        curr=curr-arr[start];
        start++;
    }
    if(curr==n){
        
        System.out.println("Number found B/w index "+start+" to "+(i-1));
    }
    if(i<n)
        curr=curr+arr[i];
}
}
 public static void main(String args[]){
 

 
 int a[]={5,4,8,4,7,4,5};
 int n=15;
 
 
 SubArraySum sb=new SubArraySum();
 
 sb.sum(a,n);
 
 
 }   
}
