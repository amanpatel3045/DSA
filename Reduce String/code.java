import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<n;i++){
            if(!s.empty() && s.peek()==a.charAt(i)){
                s.pop();
            }else{
                s.push(a.charAt(i));
            }
        }
        String ans="";
        while(!s.empty()){
            ans=s.peek()+ans;
            s.pop();
        }
        if(ans==""){
            System.out.println("Empty String");
        }else{
            System.out.println(ans);
        }
    }
}
