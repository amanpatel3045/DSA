public static void oddSumColumns(int rows, int cols, int mat[][]){
    //write your code here
     for(int i=0;i<cols;i++){
        int bag=0;
        for(int j=0;j<rows;j++){
            if(mat[j][i]%2==1){
                bag=bag+mat[j][i];
                
            
            }
        }System.out.println(bag);
    }
  }
