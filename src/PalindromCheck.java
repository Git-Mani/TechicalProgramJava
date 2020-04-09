import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PalindromCheck  {
    

public static void main(String args[]) throws Exception{
    //check palindrome
   BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
    
    String str=br.readLine();
    //String str1[]=str.split("");
    
    String reverse="";
    
   for(int i=str.length()-1;i>=0;i--){

       reverse=reverse+str.charAt(i);

}
   if(str.equals(reverse))
    System.out.print("PD");
    
}    
    
}
