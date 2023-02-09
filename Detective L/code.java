import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--!=0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] mat = new int[r][c];
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++){
                   mat[i][j] = sc.nextInt(); 
                }
            }
          int count = 0;
           int t = 0;
          while(count<(r*c)){
             for(int i = 0; i<r-t; i++){
                 System.out.print(mat[i][t]+" ");
                 count++;
             }
             t++;
             int row = r-t;
             for(int i = row,j=t; j<c; j++){
                 System.out.print(mat[i][j]+" ");
                 count++;
             }
          }
           System.out.println();
            
        }
    }
}
