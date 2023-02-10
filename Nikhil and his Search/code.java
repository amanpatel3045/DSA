import java.util.*;
class Main{
   public static int lowerBound(int arr[], int n, int x){
       int i = 0, j = n-1; // 1 2 3 4 5 6
       
       while(i <= j){
           int mid = i + (j - i) / 2;
           if(arr[mid] >= x){
               j = mid - 1;
           }else{
               i = mid + 1;
           }
       }
       return j+1;
   }
   
    public static int upperBound(int arr[], int n, int x){
       int i = 0, j = n-1;
       
       while(i <= j){
           int mid = i + (j - i) / 2;
           if(arr[mid] > x){
               j = mid - 1;
           }else{
               i = mid + 1;
           }
       }
       return j+1;
   }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int z = 0; z<n; z++){
            arr[z]=sc.nextInt();
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int nq = sc.nextInt();
        while(nq-->0){
            int q = sc.nextInt();
            int x = sc.nextInt();
            
             int ans = 0;
             if(q == 0){
                 if(arr[0]>=x){
                     ans = n;
                 }else if(arr[n-1]<x){
                     ans = 0;
                 }else{
                   int ans1 = lowerBound(arr, n, x);
                   ans = n- ans1;
                 }
             }
             else{
                 if(arr[0]>x){
                     ans = n;
                 }else if(arr[n-1]<=x){
                     ans = 0;
                 }else{
                   int ans1 = upperBound(arr, n, x);
                   ans = n - ans1;
                 }
             }
             sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}
