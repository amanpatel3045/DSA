public static void cornerSum(int n,int m,int[][] arr){
    //write your code here
    int b1=0;
    int b2=0;
    for(int i=0;i<=m-m;i++){
        for(int j=0;j<n;j++){
            b1=b1+arr[j][i];
        }
    }
    for(int a=m-1;a<=m-1;a++){
        for(int b=0;b<m;b++){
            b2=b2+arr[b][a];
        }
    }
    System.out.println(b1+b2);
    
    
  }
