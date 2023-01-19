public static void oddArray(int n, int arr[]){
    //write your code here
    for(int i=0;i<n;i++)
    {
        if(arr[i]%2==1)
        {
            System.out.println(arr[i]);
        }else
        {
            continue;
        }
    }
  }
