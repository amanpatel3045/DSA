import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[size];
        for(int a=0;a<size;a++){
            arr[a]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]%k>arr[j+1]%k){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int z=0;z<size;z++){
            System.out.print(arr[z] + " ");
        }
    }
}
