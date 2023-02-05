import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int r=sc.nextInt();
        int arr[]=new int[s];
        for(int a=0;a<s;a++){
            arr[a]=sc.nextInt();
        }
        Arrays.sort(arr);
        //int sum=0;
        int count=0;
        for(int i=0;i<s;i++){
            if(arr[i]<=r){
                r=r-arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
