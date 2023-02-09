import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int group=sc.nextInt();
        
        int arr[]=new int[2*group];
        for(int a=0;a<2*group;a++){
            arr[a]=sc.nextInt();
           
        }
       Arrays.sort(arr);
        int sum1=0;
       for(int k=0;k<2*group;k=k+2){
          
               sum1=sum1+arr[k];
           }
          
       
       System.out.println(sum1);
        }
    }
