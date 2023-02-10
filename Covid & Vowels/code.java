//Enter code here
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            String bag="";
            for(int j=i;j<s.length();j++){
                bag=bag + s.charAt(j);
                // dangerouscovid
                 if(bag.contains("a")&& bag.contains("i") &&bag.contains("o") && bag.contains("u")){
                     count++;
                 }
              
            }
            
           
        }
          System.out.println(count);
        
    }
}
