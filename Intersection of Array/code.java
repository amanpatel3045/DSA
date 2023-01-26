public static void intersectionOfArray(int n,int[] arr1,int[] arr2){
    //write your code here
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
            }
        }
    }
  }
