public static void battleOfOddAndEven(int n, int arr[]){
    //write your code here
    int sum1=0;
    int sum2=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]%2==1)
        {
            sum1=sum1+arr[i];
        }else
        {
            sum2=sum2+arr[i];
        }
    }if(sum1>sum2){
        System.out.println("Odd");
    }else
    {
        System.out.println("Even");
    }
  }
