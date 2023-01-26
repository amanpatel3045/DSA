public static void oddsOfOdds(int n,int[] arr){
    //write your code here
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==1){
            count++;
        }
    }
     if(count%2==1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
  }
