public static void minimumInArray(int N, int arr[]){
    //write your code here
    int min=arr[0];
    for(int i=0;i<N;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }System.out.println(min);
  }
