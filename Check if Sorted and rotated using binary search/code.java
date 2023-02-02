//Enter code here
import java.util.*;
class Main{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int[] A = new int[n];
        for(int z=0;z<n;z++){
            A[z] = sc.nextInt();
        }
         int count = 0;
         
         for(int y=0;y<n-1;y++){
             if(!(A[y]<=A[y+1])){
                 count++;
             }
         }
         
         if(count==1){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
    }
}
