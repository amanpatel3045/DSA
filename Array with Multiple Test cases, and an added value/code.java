//Enter code here
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++){
            int size=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();
                System.out.print(arr[j] + k + " ");
            }
            System.out.println();
        }
    }
}
