
public class RemoveSpaceWithoutReplace {
    public static void main(String args[]){
    
    String str="i am programmer";
    
    
    String str1[]=str.trim().split("\\s+");
    String str12="";
    for(int i=0;i<str1.length;i++)
        str12=str12+str1[i];
   System.out.print(str12); }
    
    
    
    
}
