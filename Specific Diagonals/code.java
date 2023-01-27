public static void specificDiagonals(int R, int C, int matrix[][], int k){
    //write your code here
    int x=0;
    int y=0;
    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(matrix[i][j]==k){
               x=i;
               y=j;
            }
        }
    }
    ArrayList<Integer> left =new ArrayList<Integer>();
    ArrayList<Integer> right =new ArrayList<Integer>();
    
    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(i-j == x-y){
                left.add(matrix[i][j]);
            }
            if(i+j==x+y){
                right.add(matrix[i][j]);
            }
        }
    }
    for(int i=0;i<left.size();i++){
        System.out.print(left.get(i) + " ");
    }
    System.out.println();
    for(int i=0;i<right.size();i++){
        System.out.print(right.get(i) + " ");
    }
  }
