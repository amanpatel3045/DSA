import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
     Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        while(n!=0){
        
        int [] arr = new int[n];
      
        for(int z=0; z<n; z++){
            arr[z] = sc.nextInt();
        }
       int em=1;
           for(int aman=0; aman<n; aman++){
               if(arr[aman]==em){
                   em++;
                } else if(!st.empty() && st.peek() ==em){
                   em++;
                  aman--;
                   st.pop();
                  }
               else {
                   st.push(arr[aman]);
                 }
              } 
           
            while (!st.empty() && st.peek()==em){
                st.pop();
                em++;
            }
            if(em==n+1){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
                
             n=sc.nextInt();
           }
     
    }
    
    
    
}
