import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String a = sc.next();
            char[] arr = a.toCharArray();
            
            Stack<Character> s = new Stack<>();
            boolean aman = true;
            for(int m=0; m<arr.length; m++){
                if(arr[m]=='('||arr[m]=='{'||arr[m]=='['){
                    s.push(arr[m]);
                }else{
                    if(s.isEmpty()){
                        aman = false;
                        break;
                    }
                    if(s.peek()=='('&&arr[m]==')'){
                        s.pop();
                    }
                    else if(s.peek()=='{'&&arr[m]=='}'){
                        s.pop();
                    }
                    else if(s.peek()=='['&&arr[m]==']'){
                        s.pop();
                    }
                    else{
                        aman = false;
                        break;
                    }
                }
            }
            if(aman){
                if(s.isEmpty()){
                    System.out.println("balanced");
                }else{
                    System.out.println("not balanced");
                }
            }
            if(!aman){
                  System.out.println("not balanced");
            }
          
        }
    }
}
