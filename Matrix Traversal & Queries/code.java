import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int arr[][] = new int[a][b];
            for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
           arr[i][j] = sc.nextInt();
            }
        }
            if(c==1){
          for(int i=0;i<a;i++){
              if(i%2==0){
          for(int j=0;j<b;j++){
                System.out.print(arr[i][j] + " ");
           }
                  }else{
          for(int j=b-1;j>=0;j--){
                System.out.print(arr[i][j] + " ");
           }
     }
 }
            }else if(c==2){
              for (int i=0;i<a;i++){
             if(i%2==0){
            for(int j=b-1;j>=0;j--){
             System.out.print(arr[i][j] + " ");
            }
            }else{
                for(int j=0;j<b;j++){
            System.out.print(arr[i][j] + " ");
                }
            }
        }
            }
            System.out.println();
            n=n-1;
        }
    }
}
