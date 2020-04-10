public class NumberConverstion {
    
    static void toOctal(int n){
    
    int rem,num=n;
    String str="";
    
    while(num>0){
    
    rem=num%8;
    num=num/8;
    str=str+rem;
    
    }
    
    char a[]=str.toCharArray();
    
    for(int i=a.length-1;i>=0;i--)
      System.out.print(a[i]); 
    }
    
    static void toBinary(int n){
    
    
    int rem,num=n ;
    String str="";
    
    while(num>0){
    
    rem=num%2;
    num=num/2;
    str=str+rem;
    
    
    
    }
        
    char a[]=str.toCharArray();
    
    for(int i=a.length-1;i>=0;i--)
      System.out.print(a[i]+" ");  
    
    }
    
    public static void main(String args[]){
    
    
    int n=20;
    
    System.out.print("----------TO Binary--------- ");
    toBinary(20);
    System.out.println("----------TO Octal--------- ");
    toOctal(1000);
    
    
    
    
    
    }
}
