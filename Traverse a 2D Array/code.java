public static void traverse2dArray(int N, int M, int matrix[][]){
    //write your code here
    for(int j=0;j<=M-1;j++){
        for(int i=N-1;i>=0;i--){
            System.out.print(matrix[i][j] + " ");
        }
    }
  }
