public static void rotateBy90(int R, int matrix[][]){
    //write your code 
    for(int j=R-1;j>=0;j--){
        for(int i=0;i<R;i++){
            System.out.print(matrix[i][j] + " ");
        }System.out.println();
    }
  }
