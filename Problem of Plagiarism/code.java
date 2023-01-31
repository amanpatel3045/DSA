import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[] = new int[n];
        for(int z=0;z<n;z++){
            arr[z]=z+1;
        }
        System.out.println(permute(arr,0,n-1,x,y));
    }
    
    public static int z;
    
    public static int permute(int arr[], int l, int r, int x, int y){
        
        if(l==r){
            z=0;
            for(int p = x; p<=y; p++){
                z=z+arr[p];
            }
        
            if(z%2!=0){
                z=0;
                return 1;
            }
            return 0;
        }
        int aman = 0;
        for(int i=l;i<=r;i++){
            swap(arr,i,l);
            aman = aman + permute(arr,l+1,r,x,y);
            swap(arr,i,l);
        }
        return aman;
}

public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
