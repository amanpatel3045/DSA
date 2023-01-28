import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc>0){
        int size=sc.nextInt();
        int arr[][]= new int[size][size];
        for(int z=0;z<size;z++){
            for(int j=0;j<size;j++){
                int aman=sc.nextInt();
               arr[z][j]=aman;
            }
        }
        for(int a=size-1;a>=0;a--){
           System.out.print(arr[a][0] + " ");
        }
        for(int b=1;b<size;b++){
            System.out.print(arr[0][b] + " ");
        }
        for(int c=1;c<size;c++){
            System.out.print(arr[c][size-1] + " ");
        }
        for(int d=size-2;d>0;d--){
            System.out.print(arr[size-1][d] + " ");
        }
        System.out.println();
        tc=tc-1;
    }

}
}
