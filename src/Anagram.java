
public class Anagram {
    public static void main(String args[]){
    
    String str1="Mother In Law";
    String str2="Hitler Woman";
    
    str1.replaceAll("\\s+","");
    str2.replaceAll("\\s+","");
    int flag=0;
    for(int i=0;i<str1.length();i++){
    
    for(int j=0;j<str2.length();j++){
    
        if(str1.charAt(i)==str2.charAt(j))
            flag=1;
    
    
    
    }
            
    }
    if(flag==1)
    System.out.print("Anagram");
    }
    
}
