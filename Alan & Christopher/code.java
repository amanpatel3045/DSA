import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc>0){
            String str=sc.next();
           Stack<Character> st = new Stack<>();
           for(int i=0;i<str.length();i++){
             if(str.charAt(i)=='#') {
                   
                    if( !st.empty() ){
                   st.pop();
                   // System.out.print(st.peek());
               }
               }else{
                   st.push(str.charAt(i));
               }
              
           }
              String aman="";
               while(!st.empty()){
                   aman=st.pop()+aman;
               }
               System.out.println(aman);
                
        tc--;
            
        }
    }
}
