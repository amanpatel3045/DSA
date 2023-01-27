public static void productOfRows(int n,int m,int[][] arr){
    //write your code here
    for(int i=0;i<arr.length;i++){
        int p=1;
        for(int j=0;j<arr[0].length;j++){
            p=p*arr[i][j];
        }
        System.out.println(p);
    }
  }
