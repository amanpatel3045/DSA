import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i == j || (i + j) == n - 1) sum+=arr[i][j];
                else if(i == 0 || j == 0 || i == n - 1|| j == n - 1) 
                sum+=arr[i][j]; 
            }
        }
        System.out.println(sum);
    }
}
