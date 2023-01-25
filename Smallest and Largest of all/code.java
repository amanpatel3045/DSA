public static void smallestAndLargest(int n,int[] arr){
    //write your code here
    int s=arr[0];
    int l=arr[0];
    for(int i=0;i<n;i++){
        if(s>arr[i]){
            s=arr[i];
        }else if(l<arr[i]){
            l=arr[i];
        }
    }System.out.println(s);
    System.out.println(l);
  }
