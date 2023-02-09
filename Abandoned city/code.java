import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--!=0){
           int n = sc.nextInt();
           int target = sc.nextInt();
           int[] arr = new int[n];
           for(int i = 0; i<n; i++){
               arr[i] = sc.nextInt();
           }
           int left = 0;
           int right = 1;
           int min = Integer.MAX_VALUE;
           int sum = 0;
           if(n>1){
             target-=(arr[left]+arr[right]); 
           }else{
               if(target<arr[0]){
                   min = 1;
               }else{
                   min = -1;
               }
           }
           boolean check = false;
           while(right<n&&left<=right){
              if(target<=0){
                  check = true;
                int num = right-left+1;  
                min = Math.min(num,min);
                target=arr[left]+target;
                left++;
                if(left>right&&right!=n-1){
                    right++;
                    target-=arr[right];
                }
              }else{
                  right++;
                 if(right<n) target-=arr[right]; 
              }
           }
           if(!check) min= -1;
           System.out.println(min);
        }
    }
}
