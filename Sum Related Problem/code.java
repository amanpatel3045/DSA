public static void sumRelatedProblem(int n){
    //write your code here
    int bag=0;
    for(int i=0;i<=n;i++){
        if(i%2==0){
            bag=bag+i;
        }
    }
    System.out.println(bag);
  }
