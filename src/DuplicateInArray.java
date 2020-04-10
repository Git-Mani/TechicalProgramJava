/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oogeyman
 */
public class DuplicateInArray {
    public static void main(String args[]){
    
        int a[]={2,5,4,2,4,1,5,2};
                
                for(int i=0;i<a.length;i++){
                  int c=1;
                    for(int j=i+1;j<a.length;j++){
                    
                    if(a[i]==a[j]){
                    
                    c++;
                    }
                    
                    }
                    if(c>1)
                    System.out.println(a[i]+" "+c);
                    
                }
    
    
    
    
    }
}
