public static void transposeTheMatrix(int N, int M, int matrix[][]){
    //write your code here
    for(int j=0;j<M;j++){
        for(int i=0;i<N;i++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
  }
