public static void averageOfAll(int n, int arr[]){
    //write your code here
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }int avg=sum/n;
     
      System.out.println(avg);
  }
