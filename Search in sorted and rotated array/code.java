import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int a=0;a<n;a++){
            arr[a]=sc.nextInt();
        }
       System.out.println(rot(arr,n,k));
    }
    public static int rot(int []arr,int n,int k){
        int low=0;
        int high=n-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(k==arr[mid]){
                return mid;
            }else if(arr[low]<=arr[mid]){
                if(k>=arr[low] && k<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else if(k>=arr[mid] && k<=arr[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
