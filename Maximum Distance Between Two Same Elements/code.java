import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
        int n = sc.nextInt();
        int [] arr = new int[n];
            
        if(n<=0){
           System.out.println("0");
        }
        int max = 0;
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
      
        HashMap<Integer, Integer> m = new HashMap<>();
      
        for(int ij=0; ij<n; ij++){
            if(!m.containsKey(arr[ij])){
                m.put(arr[ij],ij);
            }
            else{
                max = Math.max(max, ij-m.get(arr[ij]));
            }
        }
           System.out.println(max);
       
    }
    }
}
