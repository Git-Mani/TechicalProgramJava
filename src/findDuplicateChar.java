/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oogeyman
 */
public class findDuplicateChar {
    public static void main(String args[]){
    
    String str="my name is zukku";
    
    for(int i=0;i<str.length()-1;i++){
    
    for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j))
        {
        System.out.print(str.charAt(i));
        break;
        }
    
    }
    
    }
    
    
    }
    
}
