public static void longestIncreasingSubarray(int n,int[] arr){
    //write your code here
    int maxa = 0;
     int tempa = 1; 

          for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
               tempa++;
                 continue;
                              }
    if(maxa<tempa){
        maxa = tempa;
        
    }
    tempa =1;
}
 if(maxa<tempa){
        maxa = tempa;

    }
    System.out.println(maxa);
  }
