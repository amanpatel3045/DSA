public static void sumOfIndexes(int rows, int cols, int mat[][]){
    //write your code here
    int bag=0;
    for(rows=0;rows<mat.length;rows++){
        for(cols=0;cols<mat[0].length;cols++){
            bag=0;
            bag=bag+rows+cols;
            System.out.print(bag+" ");
            
        }System.out.println();
        bag=0;
    }
  }
