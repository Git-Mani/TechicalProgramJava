
import java.util.Scanner;


public class NumberCheck {
    
    static boolean check(String str){
    
        try{
            
            Integer.parseInt(str);
        
        }catch(NumberFormatException ne){
        
        return false;
        }
    
    
    return true;
    }
    
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    
    String str=sc.nextLine();
    
    boolean b=check(str);
    
    
    if(b){
    System.out.print("Number");
    }else{
     System.out.print("NotNumber");
    }
    
    }
}
