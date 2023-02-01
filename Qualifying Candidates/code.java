import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[]=new int[n];
            for(int z=0;z<n;z++)
            arr[z]=sc.nextInt();
            System.out.println(masai(arr,k,n));
        }
    }
    
    public static int masai(int arr[], int k, int n){
        Arrays.sort(arr);
        int rev[]=new int[n];
        int j = n-1;
        for(int x=0; x<n; x++){
            rev[x]=arr[j];
            j--;
        }
        
        int aman=1;
        int rank = 1;
        int drank = 0;
        int prev = rev[0];
        for(int i=1;i<n;i++){
            if(prev==rev[i]){
                if(rank<=k)
                aman++;
                drank++;
            }else{
                rank=rank+drank+1;
                if(rank<=k)
                aman++;
                drank=0;
            }
            prev=rev[i];
        }
        return aman;
    }
    
}
