import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int r=sc.nextInt();
        int arr[]=new int[n];
        for(int a=0;a<n;a++){
            arr[a]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<c;i++){
            sum=sum+arr[i];
        }
        if(sum<=r){
            System.out.println("Party");
        }else{
            System.out.println("Sad");
        }
    }
}
