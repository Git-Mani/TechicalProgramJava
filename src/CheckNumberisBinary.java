/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oogeyman
 */
public class CheckNumberisBinary {
    
    static boolean binary(int n){
    int temp=n , rem=0,flag=0;
    while(temp>0){
    
    rem=temp%10;
    temp=temp/10;
    if(rem==1 ||rem==0)
        flag=1;
    }
    if(flag==1)
    {
        return true;
    }else
        return false;
    }
    
    public static void main(String args[]){
    
    
    int n=22222;
    int i=10101010;
    
   if(binary(n)){
   System.out.print("T1");
   }
   if(binary(i)){System.out.print("T2");}
    
    
    
    }
    
}
