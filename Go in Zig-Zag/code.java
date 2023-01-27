public static void goInZigZag(int N, int M, int matrix[][]){
    //write your code here
    for(int i=0;i<N;i++){
        if(i%2==1){
            for(int j=0;j<M;j++){
                System.out.print(matrix[i][j] + " ");
            }//System.out.println();
        }
        if(i%2==0){
            for(int j=M-1;j>=0;j--){
                System.out.print(matrix[i][j] + " ");
            }//System.out.println();
        }
    }
  }
